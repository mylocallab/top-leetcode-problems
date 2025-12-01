package com.util.arraysandhashing;

public class MinInRotatedSortedArrayOneFiveThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 5, 6, 0, 1, 2, 3 };
		int minUsingBruteForce = calculateBrute(nums);
		System.out.println(minUsingBruteForce);

		int minUsingOptimum = calculateMin(nums);
		System.out.println(minUsingOptimum);
	}

	private static int calculateMin(int[] nums) {
		// TODO Auto-generated method stub
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {

			int mid = left + (right - left) / 2;
			if (nums[mid] > nums[right]) {

				left = mid + 1;

			} else {
				right = mid;
			}

		}
		return nums[left];
	}

	private static int calculateBrute(int[] nums) {
		// TODO Auto-generated method stub
		int prev = nums[0];
		for (int i = 1; i < nums.length; i++) {

			if (prev > nums[i]) {
				return nums[i];
			} else {
				prev = nums[i];
			}

		}
		return nums[0];
	}

}
