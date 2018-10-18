package com.cp;import java.util.Scanner;

public class LittleShino {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		int count = 0;

		long len = a < b ? a : b;

		if (a == 0 || b == 0) {
			System.out.println(0);
		} 
		else if (a == 1 || b == 1) {
			System.out.println(1);
		} 
		else {
			for (long i = len; i >0; i--) {

				if (a % i == 0 && b % i == 0) {
					a=a/i;
					b=b/i;
					len=len/i;
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
