package per.exercise.math;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTest {
	
	@Test
	public void testIsPrime() {
		Assert.assertEquals(isPrime(1), false);
		Assert.assertEquals(isPrime(2), true);
		Assert.assertEquals(isPrime(3), true);
		Assert.assertEquals(isPrime(4), false);
		Assert.assertEquals(isPrime(13), true);
		Assert.assertEquals(isPrime(26), false);
		Assert.assertEquals(isPrime(97), true);
	}
	
	public boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		
		//for every number a which divides n evenly, there is a
		//complement b, where a * b = n
		for (int i=2; i<= Math.sqrt(num); i++)
		{
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
