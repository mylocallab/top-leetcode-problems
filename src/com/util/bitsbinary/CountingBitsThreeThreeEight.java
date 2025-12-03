package com.util.bitsbinary;

public class CountingBitsThreeThreeEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 2;

		int[] nums = new int[n + 1];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
		}
		int[] resultArray = countOnes(nums);

		for (int i = 0; i < resultArray.length; i++) {
			System.out.println(resultArray[i]);

		}

	}

	private static int[] countOnes(int[] nums) {
		// TODO Auto-generated method stub

		for (int i = 0; i < nums.length; i++) {

			int tmp = nums[i];
			int sum = 0;
			while (tmp != 0) {

				int rem = tmp % 2;
				if (rem == 1) {
					sum++;
				}
				tmp = tmp / 2;

			}
			nums[i] = sum;
		}

		return nums;
	}

}
