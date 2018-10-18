package com.cp;import java.util.Scanner;


public class TwoSetsProblem {
	

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        
        
        
        int total = 0; //getTotalX(a, b);
        System.out.println(total);
        in.close();
    }

}
