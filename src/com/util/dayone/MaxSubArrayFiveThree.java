package com.util.dayone;

/*
 * USE KADANE approach gujarathi analogy taken from one youtube channel
 * 
 * 
 * */
public class MaxSubArrayFiveThree {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, -4 };

		int maxValueBruteForce = useBruteForce(nums);
		System.out.println("BruteForce:" + maxValueBruteForce);
		int maxValueOptimum = useOptimum(nums);
		System.out.println("Optimum:" + maxValueOptimum);
	}

	private static int useOptimum(int[] nums) {
		// TODO Auto-generated method stub

		int max = nums[0];
		int sum = nums[0];

		for (int i = 1; i < nums.length; i++) {

			// join
			if (sum >= 0) {

				sum = sum + nums[i];

			} else { // no join

				sum = nums[i];
			}

			max = Math.max(max, sum);

		}

		return max;
	}

	private static int useBruteForce(int[] nums) {
		// TODO Auto-generated method stub
		int maxSum = 0;
		int currentSum;
		for (int i = 0; i < nums.length; i++) {
			currentSum = 0;

			for (int j = i; j < nums.length; j++) {

				currentSum = currentSum + nums[j];
				maxSum = Math.max(maxSum, currentSum);

			}
		}

		return maxSum;
	}

}
