import java.lang.reflect.Array;

public class LargestNumber
{

	public static void main(String[] args) {
		
		int[] num = {-1, 45, 56, 47, -9, -5, 70, 23,86,10,-24};
		int [] nums = {-2,44,-14,-10,90,-1554,94,85,246,2980};
		LargestNumberUsingWhileLoop(num);
		LargestNumberUsingForLoop(nums);

	}
	public static void LargestNumberUsingWhileLoop(int[] numbers) {
		if (numbers != null) {
			if (numbers.length > 0) {
				int i = 1;
				int largestnumber = numbers[0];
				while (i < numbers.length) {
					if (largestnumber < numbers[i]) {
						largestnumber = numbers[i];
					}
					i++;
				}
				System.out.println("The largest number using while loops is "
						+ largestnumber);
			}
		}
	}
	public static void LargestNumberUsingForLoop(int[] numbers) {
		if (numbers != null) {
			if (numbers.length > 0) {
				int i;
				int largestnumber = numbers[0];
				for (i = 1; i < numbers.length; i++) {
					if (largestnumber < numbers[i]) {
						largestnumber = numbers[i];
					}

				}
				System.out.println("The largest number using for loops is "
						+ largestnumber);
			}
		}
	}
}