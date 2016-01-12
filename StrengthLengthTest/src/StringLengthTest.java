import static org.junit.Assert.*;

import org.junit.Test;

public class StringLengthTest {

	@Test
	public void test() {
		StringLength a = new StringLength();
		int b = a.LengthOfString("Alabama");
		assertEquals(b, 7);
	}

}
