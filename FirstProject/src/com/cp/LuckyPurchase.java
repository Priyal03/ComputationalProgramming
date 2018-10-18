package com.cp;import java.util.Scanner;

public class LuckyPurchase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str, amt;
		char four = '4', seven = '7';

		
		while(n-->0){
			str = in.next();
			amt = in.next();
			int countFour=0, countSeven=0;

//			if (!(amt.contains(four) && amt.contains(seven))) {
//				System.out.println(-1);
//			} else {
			char a[] = amt.toCharArray();
			for (int i = 0; i < a.length; i++) {
				if(a[i]=='0'  || a[i]=='1' || a[i]=='2'|| a[i]=='3'|| a[i]=='5'|| a[i]=='6'|| a[i]=='8'|| a[i]=='9'){
					System.out.println(-1);
				}
				else if(a[i]=='4'){
					countFour++;
				}
				else if(a[i]=='7'){
					countSeven++;
				}
				if(countFour !=0 && countFour==countSeven ){
					System.out.println("yeye");
				}
			}

		}
	}
}
