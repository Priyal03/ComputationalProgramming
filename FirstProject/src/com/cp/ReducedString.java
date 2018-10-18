package com.cp;import java.util.Scanner;


public class ReducedString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
						
		String str = in.next();
		
		char[] c = str.toCharArray();
		
		for(int i=1;i<str.length();i++){
			
			if(str.charAt(i)==str.charAt(i-1)){
				str = str.substring(0, i-1)+str.substring(i+1);
				i=0;
			}
			
		}
		if(str.length() == 0){
			System.out.print("Empty String");
		}else
			System.out.print(str);
	}

}
