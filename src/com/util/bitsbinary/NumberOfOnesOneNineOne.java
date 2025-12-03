package com.util.bitsbinary;

public class NumberOfOnesOneNineOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;

		int countOne = calculate(n);
		System.out.println(countOne);

	}

	private static int calculate(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		while (n != 0) {
			sum = sum + (n % 2);
			n = n >> 1;
		}
		return sum;
	}

}
