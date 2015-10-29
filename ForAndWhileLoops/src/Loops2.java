

	public class Loops2 {

		public static void main(String[] args)
		{
		int[] array1 = new int[] {40, 60, 80, 100};
		int[] array2 = new int[] {40, 20, 80, 100};
		int[] array3 = new int[] {40, 60, 80, 60};
		System.out.println("Searching in array1.....");
		FindANumberInArray(array1, 60);
		System.out.println("Searching in array2.....");
		FindANumberInArray(array2, 60);
		
		System.out.println("Finding all occurences in array2.....");
		FindOccurencesOfNumberInArray(array2, 60);
		System.out.println("Finding all occurences in array3.....");
		FindOccurencesOfNumberInArray(array3, 60);
		
		
		}
		public static void FindANumberInArray(int[] numbers, int searchNumber)
		{
			if (numbers != null)
			{
				int foundALocation = -1;
				for (int i = 0; i < numbers.length; i++)
				{
					if ( numbers[i] == searchNumber)
					{
						foundALocation = i;
						break;
					}
			}
				if (foundALocation >= 0){
			
			System.out.println("The number was found at location" + foundALocation);
		}
		else
		{
			System.out.println("The number was not found in the array");
		}
	}
	}
	public static void FindOccurencesOfNumberInArray(int[] numbers, int searchNumber)
	{
		if (numbers != null)
		{
			int countofOccurences = 0;
			for (int i = 0; i < numbers.length; i++)
			{
				if ( numbers[i] == searchNumber)
				{
					countofOccurences++;
				}
		}
			System.out.println(searchNumber + "was found" + countofOccurences + "times in the array");
		}
	}
	}
