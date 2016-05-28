package per.ds.exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BitManipulation {
	
	@Test
	public void testBitManipulation() {
		Assert.assertEquals(0b1000, 0b0110 + 0b0010);
		Assert.assertEquals(0b0011, 0b1101 >> 2);
		
		//http://stackoverflow.com/questions/791328/how-does-the-bitwise-complement-operator-work
		//~2 = -3
		// ~ 0010 = 1101 (2s complement)
		// 1101 - 1 = 1100 = Flip = 0011
		// 1101 = -3, 0011 = 3
		
		//However, can't use 0b1101 in the assertEquals, as it it interpreted as 13.
		Assert.assertEquals(-3, ~0b0010);
		Assert.assertEquals(-3, ~2);
		Assert.assertFalse(0b1101 == ~0b0010);
		
		//convert to short works.
		Assert.assertEquals((short) 0b1111111111111101, ~2);		
	}
	
	@Test
	public void testBitGet() {
		Assert.assertEquals(getBit(0b1001, 3), true);
		Assert.assertEquals(getBit(0b1001, 2), false);
		Assert.assertEquals(getBit(0b1001, 1), false);
		Assert.assertEquals(getBit(0b1001, 0), true);
	}
	
	public boolean getBit(int num, int i) {
		return ((num & (1 << i)) != 0);
	}
	
	@Test
	public void testClearBit() {
		Assert.assertEquals(clearBit(0b0001, 0), (short) 0b0);
		Assert.assertEquals(clearBit(0b0011, 1), (short) 0b1);
	}
	
	public int clearBit(int num, int i) {
		int mask = ~(1 << i);
		return num & mask;
	}
}
