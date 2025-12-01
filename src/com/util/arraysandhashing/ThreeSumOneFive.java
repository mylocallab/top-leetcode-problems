package com.util.arraysandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumOneFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { -1, 0, 1, 2, -1, -4 };

		ArrayList<List<Integer>> list = bruteForce(nums);
		System.out.println(list);

		ArrayList<List<Integer>> listN = optimum(nums);
		System.out.println(listN);

	}

	private static ArrayList<List<Integer>> optimum(int[] nums) {
		// TODO Auto-generated method stub
		if (nums == null || nums.length < 3) {

			return new ArrayList<>();

		}
		// sort the elements
		Arrays.sort(nums);
		Set<List<Integer>> result = new HashSet<>();
		// now fix the first element and find the other two elemetns

		for (int i = 0; i < nums.length - 2; i++) {

			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {

				int sum = nums[i] + nums[left] + nums[right];
				if (sum == 0) {
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));
					left++;
					right--;
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				}
			}

		}

		return new ArrayList<>(result);
	}

	private static ArrayList<List<Integer>> bruteForce(int[] nums) {
		// TODO Auto-generated method stub

		Set<List<Integer>> set = new HashSet<>();
		int n = nums.length;

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {

					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> tripLet = Arrays.asList(nums[i], nums[j], nums[k]);
						Collections.sort(tripLet);
						set.add(tripLet);
					}
				}

			}
		}
		return new ArrayList<>(set);

	}

}
