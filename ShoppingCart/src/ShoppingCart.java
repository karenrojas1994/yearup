import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
	public ArrayList<Item> shoppingCart = new ArrayList<Item>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		introduction();
		ShoppingCart cart = new ShoppingCart();
		cart.shoppingCartWork();
	}

	public static void introduction() {
		// This method prints introduction message
		System.out.println("********************************");
		System.out.println("*                              *");
		System.out.println("*        Shopping Cart         *");
		System.out.println("*                              *");
		System.out.println("********************************");

	}

	public void shoppingCartWork() {
		System.out.println("Do you want to input items? Type y/n");
		Scanner sc = new Scanner(System.in);
		String reply = sc.nextLine();

		if (reply.equalsIgnoreCase("y")) 
		{
			ScanItems();
			cleanUpCart();
			double totalWithTax = calculateTotalWithTax();
			printItemsAndTotal(totalWithTax);
			printCashOrCreditMessage(totalWithTax);
			

		} 
		else 
		{
			System.out.println("Goodbye! Thanks for shopping with us!");
		}

	}

	private void printCashOrCreditMessage(double totalWithTax) {
		// TODO Auto- method stub
		
	}

	private void printItemsAndTotal(double totalWithTax) 
	{
		if (totalWithTax <= 100 = "Use a credit card.");
	}
	{
	}
	
	System.out.println("Pay with cash");
	
			
	
	private double calculateTotalWithTax() {
		// TODO Auto-generated method stub
		return 0;
	}

	private void cleanUpCart() {
		// TODO Auto-generated method stub
		
	}

	public void ScanItems() 
	{
		System.out.println("Enter an item name: ");
		String name = sc.nextLine();
		System.out.println("Enter a price: ");
		double price = sc.nextDouble();
		System.out.println("Enter quantity: " );
		int quantity = sc.nextInt();
		sc.nextLine();

		Item nextItem = new Item(name, price, quantity);
		shoppingCart.add(nextItem);

		System.out.println("Are you done shopping? Type y/n.");
		String reply = sc.nextLine();
		
		if (reply.equalsIgnoreCase("n"))
		{
			ScanItems();
		}
		else
		{
			System.out.println("These are your items.");
			ListItems();
		}
	}
	
	public void ListItems() 
	{
		for (int i = 0; i < shoppingCart.size(); i++)
		{
			Item currentItem = shoppingCart.get(i);
			System.out.println("Item number " + (i+1) + " Name: " + currentItem.m_name + " Price: "+ currentItem.m_price + " Quantity: "+ currentItem.m_quantity );
			
		}
		
	}
}