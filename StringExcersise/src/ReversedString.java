
public class ReversedString {

	public static void main(String[] args)
	{
ReverseOutOfPlace("cool whip");

	}
public static void ReverseOutOfPlace(String originalString)
{
	if (originalString != null)
	{
		char[] originalStringCharacters = originalString.toCharArray();
		char[] reverseStringCharacters = new char[originalString.length()];
		
		for (int i = 0, j = originalStringCharacters.length -1; i < reverseStringCharacters.length; i++, j--)
		{ 
			reverseStringCharacters[i] = originalStringCharacters[j];
		}
		String reverseString = new String(reverseStringCharacters);
		System.out.println("The reversed string out of place is: " + reverseString);
	}
}
public static void ReverseInPlace(String originalString)
{
	if (originalString != null)
	{
		char[] characters = originalString.toCharArray();
		for (int i = 0, j = characters.length -1; i < characters.length/2; i++, j--);
		{
			char temp = characters[j];
			characters[j] = characters[i];
			characters[i] = temp;
			
		}
		String reverseString = new String(characters);
		System.out.println("The reversed string in place is: " + reverseString);
		
		}
	}
}
