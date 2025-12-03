package com.util.bitsbinary;

/*
 * Reverse bits of a given 32 bits signed integer.

 

Example 1:

Input: n = 43261596

Output: 964176192

Explanation:

Integer	Binary
43261596	00000010100101000001111010011100
964176192	00111001011110000010100101000000
Example 2:

Input: n = 2147483644

Output: 1073741822

Explanation:

Integer	Binary
2147483644	01111111111111111111111111111100
1073741822	00111111111111111111111111111110
 

Constraints:

0 <= n <= 231 - 2
n is even.*/

public class ReverseNumberOneNineZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 2147483644;
		int reverseResult = reverse(n);
		System.out.println(reverseResult);

		int practiSResult = reversePractise(n);
		System.out.println(practiSResult);

	}

	private static int reversePractise(int n) {
		// TODO Auto-generated method stub

		int result = 0;

		for (int i = 0; i < 32; i++) {

			int lastBit = n & 1;
			result = result << 1;
			result = result | lastBit;
			n = n >>> 1;

		}

		return result;
	}

	private static int reverse(int n) {
		// TODO Auto-generated method stub
		int result = 0;

		for (int i = 0; i < 32; i++) {
			// step1 get the last bit

			int lastBit = n & 1;

			// step2: shift result left to make space
			result = result << 1;

			// step3: add the last bit to result OR
			result = result | lastBit;

			// step4: shift n right to process next bit

			n = n >>> 1;

		}
		return result;
	}

}
