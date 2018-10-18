package com.cp;import java.util.Scanner;


public class LowestTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
			int b = in.nextInt();
			double a = in.nextDouble();
			
			double h = (a*2)/b;
			
			System.out.println(h);
	}

}
