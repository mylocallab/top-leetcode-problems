package com.util.arraysandhashing;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateLTTwoOneSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 3, 1 };
		boolean containDuplicate = bruteForce(nums);
		boolean containDuplicateHS = usingHashset(nums);
		System.out.println("Using BruteForce:" + containDuplicate);
		System.out.println("Using HashSet:" + containDuplicateHS);
	}

	private static boolean usingHashset(int[] nums) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {

			if (hs.contains(nums[i])) {
				return true;
			}
			hs.add(nums[i]);
		}
		return false;
	}

	private static boolean bruteForce(int[] nums) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				return true;
			}
		}
		return false;
	}

}
