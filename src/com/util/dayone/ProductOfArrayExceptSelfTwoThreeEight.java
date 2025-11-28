package com.util.dayone;

public class ProductOfArrayExceptSelfTwoThreeEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4 };
		int[] productOfArray = calculateProdBruteForce(nums);
		for (int i = 0; i < productOfArray.length; i++) {
			// System.out.println(productOfArray[i]);
		}

		int[] productOfArrayB = calculateProductB(nums);

		for (int i = 0; i < productOfArrayB.length; i++) {
			System.out.print(productOfArrayB[i]+" ");
		}
	}

	private static int[] calculateProductB(int[] nums) {
		// TODO Auto-generated method stub

		int[] leftProduct = new int[nums.length];
		int[] rightProduct = new int[nums.length];

		leftProduct[0] = 1;

		for (int i = 1; i < nums.length; i++) {

			leftProduct[i] = nums[i - 1] * leftProduct[i - 1];

		}

		rightProduct[nums.length - 1] = 1;

		for (int i = nums.length - 2; i >= 0; i--) {

			rightProduct[i] = rightProduct[i + 1] * nums[i + 1];

		}

		int[] ans = new int[nums.length];
		for (int i = 0; i < rightProduct.length; i++) {
			ans[i] = leftProduct[i] * rightProduct[i];
		}

		return ans;
	}

	private static int[] calculateProdBruteForce(int[] nums) {
		// TODO Auto-generated method stub

		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {

			int product = 1;
			for (int j = 0; j < nums.length; j++) {

				if (i != j) {
					product = product * nums[j];
				}

			}
			result[i] = product;

		}
		return result;
	}

}
