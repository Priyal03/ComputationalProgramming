package com.cp;import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GameOfSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t-->0){
			
			int n=in.nextInt();
			
			int arr[] = new int[n];
			int b[] = new int[n];
			List<Integer> list = new ArrayList<Integer>();
			
			for(int i=0;i<n;i++){
				arr[i]=in.nextInt();				
								
				if(!list.contains(arr[i])){
					list.add(arr[i]);
				}
			}
			
			int len = list.size();
			
			if(len%2==0){
				System.out.println('Q');				
			}else
				System.out.println('P');
		}
	}

}
