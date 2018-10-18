package com.cp;import java.util.Scanner;

public class CChefAndHisCake {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt(), ans = 0;
			int m = in.nextInt();
			String str;

			char ch[][] = new char[n][m];

			for (int i = 0; i < n; i++) {

				str = in.next();
				for (int j = 0; j < m; j++) {

					ch[i][j] = str.charAt(j);
//					System.out.print(ch[i][j]);
				}

			}
			char first = ch[0][0];
			int cost1=0, cost2=0, cost=0;
			for (int i = 0; i < n; i++) {
				
				for (int j = 1; j < m; j++) {
					
					char x = ch[i][j];
					
					if (x == 'R' && first == x) {
						 ch[i][j] = 'G';
						 cost1 += 5;
						 } else if (x == 'G' && first == x) {
						 ch[i][j] = 'R';
						 cost1 += 3;						
					}
					first = ch[i][j];
//					System.out.println(first + " " + j + " " + ch[i][j]);
					//System.out.println(cost1 + " " + "cost1");
				}
			}
			// char first = ch[0];
			// int cost1 = 0, cost2 = 0, cost = 0;
			//
			//
			//
			// char x = ch[j];
			// if (x == 'R' && first == x) {
			// ch[j] = 'G';
			// cost1 += 5;
			// } else if (x == 'G' && first == x) {
			// ch[j] = 'R';
			// cost1 += 3;
			// }
			//
			// first = ch[j];
			// // System.out.println(first + " " + j + " " + ch[j]);
			// //System.out.println(cost1 + " " + "cost1");
			// }
			// ch = cake.toCharArray();
			// first = ch[m-1];
			// for (int j = m - 2; j >= 0; j--) {
			//
			// // System.out.println(first + " " + j + " " + ch[j]);
			// char x = ch[j];
			// if (x == 'R' && first == x) {
			// ch[j] = 'G';
			// cost2 += 5;
			// } else if (x == 'G' && first == x) {
			// ch[j] = 'R';
			// cost2 += 3;
			// }
			//
			//
			// // System.out.println(cost2 + " " + "cost2");
			// // System.out.println(first + " " + j + " " + ch[j]);
			// first = ch[j];
			// }
			//
			// cost = cost1 < cost2 ? cost1 : cost2;
			// // System.out.println(cost + " " + "cost");
			// ans = ans + cost;
			// }
			System.out.println(cost1);
		}

	}

}
