import static org.junit.Assert.*;

import org.junit.Test;


public class ConcatenateTest {

	@Test
	public void testConcatenateTwo() 
	{
		Concatenate concat = new Concatenate();
		
		String resultOne = concat.ConcatenateTwo("Jovanni", "Hernandez");
		assertEquals(resultOne, "Jovanni Hernandez");
		
		String resultTwo = concat.ConcatenateTwo("Hello", "World");
		assertEquals(resultTwo, "Hello World");
	}

	@Test
	public void testConcatenateThree()
	{
		Concatenate concat = new Concatenate();
		
		String resultOne = concat.ConcatenateThree("Happy ", "Birthday ", "to you");
		assertEquals(resultOne, "Happy Birthday to you");
		
		String resultTwo = concat.ConcatenateThree("", "", "");
		assertEquals(resultTwo, "");
	}
}
