package per.exercise.ds;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * You are given two sorted arrays, A and B
 * where A has a large enough buffer at the end to hold B.
 * Write a method to merge B into A in sorted order
 *
 */
public class MergeArrayTest {
	
	private int [] a = {3, 5, 7, 9, -1, -1, -1, -1}; //-1 is reserved space for B
	private int [] b = {1, 2, 4, 11};
	
	// {3, 5, 7, 9, -1, -1, -1}
	// {3, 5, 7, 9, -1, -1, 11}
	// {3, 5, 7, 9, -1, 9, 11}
	// {3, 5, 7, 9, 7, 9, 11}
	// {3, 5, 7, 5, 7, 9, 11}
	// {3, 5, 4, 5, 7, 9, 11}
	// {3, 3, 4, 5, 7, 9, 11}
	// {1, 3, 4, 5, 7, 9, 11}
	
	@Test
	public void testMerge() {
		int [] c = {1, 2, 3, 4, 5, 7, 9, 11};
		Assert.assertTrue(Arrays.equals(c, merge(a, b, 4)));
		
	}

	public int [] merge(int [] a, int [] b, int asize) {
		int indexA = asize - 1;
		int indexB = b.length - 1;
		int mergeIndexA = a.length - 1;
		
		while ((indexA >= 0) && (indexB >= 0)) {
			if (a[indexA] > b[indexB]) {
				a[mergeIndexA] = a[indexA];
				indexA--;
			} else {
				a[mergeIndexA] = b[indexB];
				indexB--;
			}
			mergeIndexA--;
		}
		
		while (indexB >= 0) {
			a[mergeIndexA] = b[indexB];
			indexB--;
			mergeIndexA--;
		}
		
		for (int i: a) {
			System.out.print(i + ", ");	
		}
		
		return a;
	}
}
