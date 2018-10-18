package com.cp;import java.util.HashSet;
import java.util.Scanner;

public class Ubona {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			String str = in.next();
			char arr[] = str.toCharArray();
			HashSet<Character> chSet = new HashSet<Character>();
			
			Long answer = 1L;

			for (int i = 0; i < str.length(); i++) {
				if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i'
						|| arr[i] == 'o' || arr[i] == 'u') {
					
					chSet.add(arr[i]);	
					
				}
				if (arr[i] == '_') {
					answer *= chSet.size();					
				}
			}

			System.out.println(answer);
		}
	}

}
