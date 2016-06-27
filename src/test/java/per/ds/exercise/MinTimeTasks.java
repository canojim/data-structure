package per.ds.exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MinTimeTasks {

	/*
	 * Given time taken by n tasks. Find the minimum time needed to finish the
	 * tasks such that skipping of tasks is allowed, but can not skip two
	 * consecutive tasks.
	 */
	@Test
	public void testMinTime() {
		int[] times1 = { 10, 5, 7, 10 };
		Assert.assertEquals(12, getMinTime(times1));

		int[] times2 = { 10 };
		Assert.assertEquals(0, getMinTime(times2));

		int[] times3 = {10, 5, 2, 4, 8, 6, 7, 10};
		Assert.assertEquals(22, getMinTime(times3));
	}

	public int getMinTime(int[] times) {

		return Math.min(getMinTime(times, 0), getMinTime(times, 1));
	}

	public int getMinTime(int[] times, int idx) {
		if (idx >= times.length) {
			return 0;
		}

		return Math.min(times[idx] + getMinTime(times, idx + 1), times[idx]
				+ getMinTime(times, idx + 2));
	}
}
