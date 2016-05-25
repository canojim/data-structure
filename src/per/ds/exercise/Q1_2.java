package per.ds.exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Q1_2 {

	@Test
	public void testReverse() {
		
		Assert.assertEquals(reverse("abcde"), "edcba");
	}
	
	public String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}
		
}
