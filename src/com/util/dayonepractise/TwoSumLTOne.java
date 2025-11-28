package com.util.dayonepractise;

import java.util.HashMap;

public class TwoSumLTOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 3, 11, 15,7 };
		int target = 9;
		int[] indicesResult = findIndices(nums, target);
		for (int i = 0; i < indicesResult.length; i++) {
			System.out.println(indicesResult[i]);
		}

		int[] indResult = findBrute(nums, target);

		for (int i = 0; i < indResult.length; i++) {
			System.out.println(indResult[i]);
		}
	}

	private static int[] findBrute(int[] nums, int target) {
		// TODO Auto-generated method stub
		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}

	private static int[] findIndices(int[] nums, int target) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			int compliment = target - nums[i];

			if (hm.containsKey(compliment)) {
				return new int[] { hm.get(compliment), i };
			}
			hm.put(nums[i], i);
		}
		return null;
	}

}
