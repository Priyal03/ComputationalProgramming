package com.cp;import java.util.Scanner;

public class ReunionOf1s {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int n = in.nextInt(),x=0;
		int k = in.nextInt();

		String str = in.next();

		while (k-- > 0) {
			int t = in.nextInt(), count = 0;

			if (t == 1) {

				x = Integer.parseInt(str, 2);

				while (x != 0) {
					x = (x & (x << 1));					
					count++;
				}
				System.out.println(count);				
				
			}else if(t==2){
				
				int pos = in.nextInt();
				pos--;				
				
				if(str.charAt(pos)!='1'){
					str = str.substring(0, pos)+'1'+str.substring(pos+1);					
				}				
			}
		}

	}

}
