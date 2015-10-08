
public class Main {

	public static void main(String[] args) 
	{
	Person student = new Person("Ana Rojas", 21,"7708889999", "730 Peachtree St.");
	System.out.println("student's name is " + student.GetName());
	System.out.println("student's age is " + student.GetAge());
	System.out.println("student's phoneNumber is " + student.GetPhoneNumber());
	System.out.println("student's address is " + student.GetAddress());

	}

}
