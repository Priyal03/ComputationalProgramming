package com.cp;

import java.util.Scanner;


public class Accomodation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int capacity = in.nextInt();
		int people = in.nextInt(),count=0, div=0,mod=0;
		int floor[] = new int[capacity];
		
		for(int i=0;i<capacity;i++){
			floor[i]=in.nextInt();
			
			if(people%floor[i] == 0){
				
				count++;				
			}else{
				
				div = people/floor[i];
				//mod = people%floor[i];
				count = count + div+mod;
			}	//System.out.println(count);							
		}
		
		System.out.println(count);
		
		
	}

}
