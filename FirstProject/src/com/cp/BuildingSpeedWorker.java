package com.cp;import java.util.Arrays;
import java.util.Scanner;

public class BuildingSpeedWorker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		

		Scanner in = new Scanner(System.in);
		
			int n = in.nextInt(),sum=0, len = 2*n;

			int arr[] = new int[len];
			
			for (int i = 0; i < len; i++) {
				arr[i] = in.nextInt();
			}
			
			Arrays.sort(arr);
			
			for(int i=0; i<len; i=i+2){
				sum=sum+arr[i];				
			}
			
			System.out.println(sum);
		}
	

}
