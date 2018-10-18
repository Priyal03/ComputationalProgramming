package com.cp;import java.util.Scanner;


public class FredoAndArrayUpdate {
	
	public static void main(String[] args) {		

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x[] = new int[n];
		int initialSum=0;
		
		for(int i=0;i<n;i++){

			x[i]=in.nextInt();
			initialSum = initialSum + x[i];
			
		}
		 
		int a = initialSum/n;
		int i;
		System.out.println(a);
		a++;
		for(i=a-1;i<n;i++){
			
			if(x[i]==(a)){
		
				break;
			}
			a++;
		}
		
		System.out.println(a);
	}

}
