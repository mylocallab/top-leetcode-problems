package com.util.bitsbinary;

//without using + and - need to add two integers

public class SumOfTwoIntegersThreeSevenOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		int b = 3;
		int result = Calculate(a, b);
		System.out.println(result);

		int resultPractise = calculateRes(a, b);
		System.out.println(resultPractise);

	}

	private static int calculateRes(int a, int b) {
		// TODO Auto-generated method stub
		while (b != 0) {

			int tmp = (a & b) << 1;
			a = a ^ b;
			b = tmp;

		}
		return a;
	}

	private static int Calculate(int a, int b) {
		// TODO Auto-generated method stub
		while (b != 0) {

			int tmp = (a & b) << 1;
			a = a ^ b;
			b = tmp;
		}
		return a;
	}

}
