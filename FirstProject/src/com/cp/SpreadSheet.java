package com.cp;import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpreadSheet {

	public static void main(String args[]) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine()),row=0,c=1;
		
		while(t>(702*c)){
			
			row=row + ++c;
			System.out.print(row);
		}
		//System.out.println();
		int a, b;
		char x[] = new char[27];

		for (int i = 0; i < 27; i++) {

			x[i] = (char) (i + 64);
		}
		
		while(t>702){
			t=t-702;
		}
		
		if (t > 0) {

			if (t > 26){
				a = t / 26;
				if ((t % 26) == 0)
					System.out.print(x[a - 1]);
				else
					System.out.print(x[a]);
			}
			
			b = t % 26;
			if ((t % 26) != 0)
				System.out.println(x[b]);
			else
				System.out.println(x[b + 26]);

		}
	}
}