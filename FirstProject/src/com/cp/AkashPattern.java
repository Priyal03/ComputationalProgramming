package com.cp;import java.util.Scanner;

public class AkashPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), count = 0, num = 0, line = n, a=1, countF=n, sq=(n*n), countE = sq+n;;

		int br = (((n * n) + n) / 2) + 1;

		while (line-->0) {
			
			for(int i=0;i<count;i++)
				System.out.print("-");
			
			for (int i= a; i <= countF; i++) {
				System.out.print(i + "*");
				a=i;
			}
			for (int i = sq+1 ; i < countE; i++) {
				System.out.print(i + "*");
				
			}
			System.out.println();
//			System.out.println((n * n) + n);
			count=count+2;
			a=a+1;
			sq=sq-n+1;
			countF=countF+line;
			countE=countE-line;
			//System.out.println("a"+a);
		}

	}
}
