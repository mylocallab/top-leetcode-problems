package com.util.arraysandhashing;

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
		
		int n=nums.length;
		int product=1;
		int ans=nums[0];
		int leftProduct=1;
		int rightProduct=1;
		for(int i=1;i<n;i++) {
			
			leftProduct=(leftProduct==0?1:leftProduct);
			rightProduct=(rightProduct==0?1:rightProduct);
			
			leftProduct=leftProduct*nums[i];
			rightProduct=rightProduct*nums[n-1-i];
			
			ans=Math.max(ans, Math.max(rightProduct, leftProduct));
			
		}
		return ans;
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
