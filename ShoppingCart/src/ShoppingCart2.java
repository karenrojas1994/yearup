
public class ShoppingCart2 {
	import java.util.ArrayList;
	 import java.util.Scanner;
	 import java.text.DecimalFormat;

	 public class ShoppingCart {

	 static DecimalFormat f = new DecimalFormat("'$' 0.00");
	 static Scanner s = new Scanner(System.in);
	 static ArrayList<Product> item = new ArrayList<Product>();
	 static double Total = 0;

	 public static <Product> void main(String[] args) {

	 Intro();
	 Shopping();

	 }

	 public static void Intro() {
	 System.out.println("Welcome to the Shopping Cart!!\n" + "\n"
	 + "*********************************\n"
	 + "*                               *\n"
	 + "*         Shopping Cart         *\n"
	 + "*                               *\n"
	 + "*********************************");

	 }

	 public static void Shopping() {

	 System.out.println("Do you want to input items? Type y/n");
	 String reply = s.nextLine();
	 if (reply.equalsIgnoreCase("y")) {
	 Read();
	 Clean();
	 Total();
	 Taxed(Total);

	 } else {

	 System.out.println("GoodBye!");
	 }

	 }

	 public static void Read() {
	 System.out.println("Enter item Name: ");
	 String Name = s.next();
	 while (!Name.equalsIgnoreCase("q")) {
	 System.out.println("Enter a quantity:");
	 int Quantity = s.nextInt();
	 System.out.println("Enter a price: ");
	 double Price = s.nextDouble();
	 s.nextLine();
	 Product newItem = new Product(Name, Quantity, Price);
	 item.add(newItem);
	 System.out.println("Enter next item Name or Q to quit: ");
	 Name = s.next();
	 s.nextLine();
	 }
	 }

	 private static void listProducts() {
	 for (int i = 0; i < item.size(); i++) {
	 Product current = item.get(i);
	 System.out.println("You picked up " + current.getQuantity() + " of "
	 + " item number " + (i + 1) + " is " + current.getName()
	 + " at the price of $" + current.getPrice());
	 }
	 System.out.println("\n");
	 }

	 public static void Clean() {
	 listProducts();
	 System.out.println(
	 "Would you like to remove something from the cart y/n:\n");
	 String in = s.nextLine();
	 if (in.equalsIgnoreCase("y")) {
	 System.out.println(
	 "Enter the number of the item you want to remove, -1 to quit: ");
	 int indexRead = s.nextInt();

	 int indexOfItem = indexRead - 1;
	 while (indexRead != -1) {
	 Product Remove = item.get(indexOfItem);
	 if (Remove != null) {
	 item.remove(indexOfItem);
	 System.out.println("You have removed " + Remove.getName());
	 listProducts();
	 }
	 System.out.println("Enter another item number or -1 to quit:");
	 indexRead = s.nextInt();

	 }
	 }
	 }

	 private static void Total() {
	 double price = 0;

	 int i = 0;
	 while (i < item.size()) {

	 for (i = 0; i < item.size(); i++) {
	 Product CP = item.get(i);
	 price = price + (CP.getPrice() * CP.getQuantity());
	 }
	 System.out.println("The total Price with tax is $" + f.format(price));

	 }
	 Total = price;
	 }

	 public static double Taxed(double total) {

	 double TWT = total + (total * .075);
	 // I would like to continuosly provide them with the option to remove
	 // and item and it goes in an endless loop

	 System.out.println("Your price with tax is $" + f.format(TWT) + "\n");
	 // if (TWT >= 100) {
	 // System.out.println(
	 // "Your total is above $100. You have to pay with card. Do you want to
	 // continue shopping y or n:");
	 // String re = s.nextLine();
	 //
	 // if (!re.equalsIgnoreCase("n")) {
	 // Shopping();
	 // } else if (re.equalsIgnoreCase("n")) {
	 // System.out.println("Do you want to remove an item, y or n:");
	 // String reply = s.nextLine();
	 //
	 // if (!reply.equalsIgnoreCase("n")) {
	 // Clean();
	 //
	 // } else if (reply.equalsIgnoreCase("n")) {
	 // Total();
	 // Taxed(Total);
	 // }
	 // System.out.println("Your price with tax is $" + TWT + "\n");
	 // }
	 //
	 // } else if (TWT < 100) {
	 // System.out.println(
	 // "You purchase is below $100 would you like to continue to shop. y or
	 // n and press enter twice:");
	 // String re = s.nextLine();
	 // s.nextLine();
	 // if (!re.equalsIgnoreCase("n")) {
	 // Shopping();
	 // }
	 // System.out.println("Thank you for shopping your price is $");
	 // }

	 // I can get this to print out the total price that they have and of
	 // they are above 100 they have to pay for cards
	 if (TWT >= 100) {
	 System.out.println(
	 "Your total is above $100. You have to pay with card.");
	 } else if (TWT < 100) {
	 System.out.println(
	 "You purchase is below $100 would you like to continue to shop. y or n and press enter twice:");
	 String re = s.nextLine();
	 s.nextLine();
	 if (!re.equalsIgnoreCase("n")) {
	 Shopping();
	 }

	 }

	 System.out.println("Thank you for shopping your price is $" + f.format(TWT));
	 return TWT;

	 }

	 } 

}
