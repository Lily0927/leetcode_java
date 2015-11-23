package Leetcode;

import java.util.Arrays;

public class KthLargestElementInAnArray {
	public static int findKthLargest(int[] nums, int k) {
		int len = nums.length;
		if (len <= 1) {
			return nums[0];
		}
		int[] dupli = new int[len];
		for (int i = 0; i < len; i++) {
			dupli[i] = nums[i];
		}
		Arrays.sort(dupli);
		return dupli[len-k];
	}

	public static void main(String[] args) {
		int[] nums = { 4,3,3,3,3 };
		int result = findKthLargest(nums, 5);
		System.out.print(result);
	}
}
