import java.util.Scanner;

public class OddEvenProj
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int remainder = number % 2;
		
		if (remainder == 0)
		{
			System.out.println(number + " is even");
		}
		else
		{
			System.out.println(number + " is odd");
		}
		
		/*  other ways to write the else part
		 if (remainder == 1)
		 {
			System.out.println(number + " is odd");
		 }
		 
		 if (remainder != 0)
		 {
			System.out.println(number + " is odd");
		 }
		 */
		
		s.close();
	}

}

