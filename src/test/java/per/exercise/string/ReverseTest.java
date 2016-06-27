package per.exercise.string;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseTest {

	@Test
	public void testReverse() {
		
		Assert.assertEquals(reverse("abcde"), "edcba");
	}
	
	public String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}
		
}
