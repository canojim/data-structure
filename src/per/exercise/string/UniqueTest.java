package per.exercise.string;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UniqueTest {

	// Check uniqueness
	
	@Test
	public void testIsUnique() {
		System.out.println("This is a TestNG-Maven based test");
		Assert.assertEquals(true, isUnique1("asdfg"));
		Assert.assertEquals(false, isUnique1("asdfga"));

		Assert.assertEquals(true, isUnique2("asdfg"));
		Assert.assertEquals(false, isUnique2("asdfga"));

	}

	public static boolean isUnique1(String s) {
		// no data structure - O(n2)
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					return false;
				}
			}
		}

		return true;
	}

	public static boolean isUnique2(String s) {
		// use set: O(n)
		Set<String> charSet = new HashSet<String>();

		for (int i = 0; i < s.length(); i++) {
			String oneChar = s.substring(i, i + 1);
			if (charSet.contains(oneChar)) {
				return false;
			} else {
				charSet.add(oneChar);
			}
		}

		return true;
	}

}
