package com.util.bitsbinary;

import java.util.HashSet;

public class MissingNumberTwoSixEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 2, 1,4,5,6 };

		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {

			
			
			hs.add(nums[i]);
		}
		int missingNumber = checkMissing(nums, hs);

		System.out.println(missingNumber);

	}

	private static int checkMissing(int[] nums, HashSet<Integer> hs) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= nums.length; i++) {

			if (!hs.contains(i)) {
				return i;
			}
		}
		return -1;
	}

}
