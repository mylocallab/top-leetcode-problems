package com.util.dayone;

public class SlidingWindowBestTimeStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int maxProfit = calculateProfitBruteForce(prices);
		System.out.println("Brute Force approach");
		System.out.println(maxProfit);

		int maxProfitSliding = calculateProfit(prices);
		System.out.println("Sliding Window/Two pointer approach");
		System.out.println(maxProfitSliding);

	}

	private static int calculateProfit(int[] prices) {
		// TODO Auto-generated method stub
		int profit = 0;
		int left = 0;
		for (int right = 1; right < prices.length; right++) {

			if (prices[right] > prices[left]) {
				profit = Math.max(profit, prices[right] - prices[left]);
			} else {
				left = right;
			}
		}

		return profit;
	}

	private static int calculateProfitBruteForce(int[] prices) {
		// TODO Auto-generated method stub
		int profit = 0;
		for (int i = 0; i < prices.length; i++) {

			for (int j = i + 1; j < prices.length; j++) {

				if (prices[j] > prices[i]) {
					profit = Math.max(profit, prices[j] - prices[i]);
				}

			}
		}
		return profit;
	}

}
