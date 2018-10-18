package com.cp;import java.util.Scanner;

public class NumberGroups {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		

		long firstElement = (long) (Math.pow((k-1),2)+(k-1)+1);
		long ans =  firstElement;

		for (int i = 0; i<(k-1) && k!=1; i++) {
			ans += firstElement + 2;
			firstElement += 2;

		}

		System.out.println(ans);

	}
}
