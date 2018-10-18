package com.cp;import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndArray {
    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
        int T = in.nextInt();               
        
        for(int a0 = 0; a0 < T; a0++){
            
        	int n = in.nextInt();
            int[] a = new int[n];
            boolean flag = false;
            int right = 0; int left=0;
            
            for(int a_i=0; a_i < n; a_i++){
                
            	a[a_i] = in.nextInt();
                right +=a[a_i];
                
            }
            
            if(n==1)
            	System.out.println("YES");
            else{
            	
            	right -= a[0];
            	for(int i=1; i<a.length ; i++){
            		
            		if(left == right){
            			
            			flag = true;
            			break;
            		}
            		
            		left += a[i-1];
            		right -= a[i];            		            		
            		
            	}
            			
            	if(flag)
        			System.out.println("YES");
        		else
        			System.out.println("NO");
            	
            }
        }
    }
}
