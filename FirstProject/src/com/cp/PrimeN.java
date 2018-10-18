package com.cp;import java.util.*;

public class PrimeN {

	public static boolean isPrime(int num) {

		if (num < 2)
			return false;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int q = in.nextInt(), startVal, endVal;
		System.out.println("Starting to print OTP");
		while (q-- > 0) {

			startVal = in.nextInt();
			endVal = in.nextInt();

			int min = 0, max = 0;
			int j = startVal;
			boolean foundIt = false;
			
			while (j <= endVal && !foundIt) {

				if (isPrime(j)) {

					min = j;
					foundIt = true;
					break;
				}
				j++;
				
			}
			foundIt = false;

			if (min != 0) {

				int i = endVal;
				while (i >= min && !foundIt) {

					if (isPrime(i)) {
						max = i;
						foundIt = true;
						break;
					}
					i--;					
				}

				System.out.println(max - min);
			} else

				System.out.println(0);
		}
	}
}
