package com.util.dayone;

public class MaximumProductSubarrayOneFiveTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2, 3, -2, 4 ,0,4,5,0};

		int maxProductBruteForce = calculateBrut(nums);
		System.out.println("Brute:" + maxProductBruteForce);
		
		
		int maxProductOptimum=calculateOptimum(nums);
		System.out.println("Optimum:"+maxProductOptimum);

	}

	private static int calculateOptimum(int[] nums) {
		// TODO Auto-generated method stub
		
		return 0;
	}

	private static int calculateBrut(int[] nums) {
		// TODO Auto-generated method stub
		int max = nums[0];
		int product;
		for (int i = 0; i < nums.length; i++) {

			product = 1;

			for (int j = i; j < nums.length; j++) {

				product = product * nums[j];
				max = Math.max(max, product);

			}

		}

		return max;
	}

}
