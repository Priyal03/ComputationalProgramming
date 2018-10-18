package com.cp;import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class BigSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		String[] unsorted = new String[n];
		HashSet<Long> bigI = new HashSet<Long>();
		
		for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {			
			unsorted[unsorted_i] = in.next();
			
			if(unsorted[unsorted_i].length()>10000000){
				bigI.add(Long.parseLong(unsorted[unsorted_i]));
				
			}
		}

		int fromIndex=0;
		int toIndex = n;
		Arrays.sort(unsorted, fromIndex, toIndex);
		
		for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
			System.out.println(unsorted[unsorted_i]);
		}
		
	}

}
