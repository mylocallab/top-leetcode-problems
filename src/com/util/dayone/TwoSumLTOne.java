package com.util.dayone;

import java.util.HashMap;

//Two Sum Main Logic resides in compliment or called diff
//2+7=9
//can also called 2=9-7
//so we need to store the indices in hashmap value and index
//if 2 already present in the map we get that index
//
//
//
//

public class TwoSumLTOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] resultHashMap = twoSum(nums, target);
		System.out.println("HashMap result TC O(n)");
		for (int i = 0; i < resultHashMap.length; i++) {
			System.out.print(resultHashMap[i] + " ");
		}

		int[] resultBruteForce = bruteForce(nums, target);
		
		System.out.println("\nBruteForce result TC O(n^2)");
		for (int i = 0; i < resultBruteForce.length; i++) {
			System.out.print(resultBruteForce[i] + " ");
		}
	}

	private static int[] bruteForce(int[] nums, int target) {
		// TODO Auto-generated method stub
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}

	private static int[] twoSum(int[] nums, int target) {
		// TODO Auto-generated method stub

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {

			int compliment = target - nums[i];

			if (hm.containsKey(compliment)) {
				return new int[] { hm.get(compliment), i };
			}

			hm.put(nums[i], i);

		}

		return new int[] {};
	}

}
