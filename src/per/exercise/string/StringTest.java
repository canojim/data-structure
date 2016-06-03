package per.exercise.string;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringTest {
	
	@Test
	public void testStringBuilder() {
		String [] a = { "abc", "de", "fghi" };
		Assert.assertEquals(concat(a), "abcdefghi");
	}
	
	public String concat(String [] a) {
		StringBuilder sb = new StringBuilder();
		//replacement of StringBuffer if synchronization is not required.
		//faster
		
		for (String s: a) {
			sb.append(s);
		}
		
		return sb.toString();
	}
}
