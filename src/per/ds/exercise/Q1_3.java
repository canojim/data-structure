package per.ds.exercise;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Q1_3 {
	
	@Test
	public void testPermutation() {
		Assert.assertEquals(true, isPermutation("abcde", "edcab"));
		Assert.assertEquals(false, isPermutation("abcde", "edcabz"));
		
	}
	
	//O(n log n)
	public boolean isPermutation(String s1, String s2) {
		if (s1 == null || s2 == null || s1.length() != s2.length()) {
			return false;
		}
		String sortS1 = sort(s1);
		String sortS2 = sort(s2);
		
		return sortS1.equals(sortS2);
	}
	
	public String sort(String s) {
		char[] ca = s.toCharArray();
		Arrays.sort(ca);
		return new String(ca);
	}
}
