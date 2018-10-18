package examples;

import java.util.Arrays;
import java.util.Scanner;

public class Sticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);        
        int t=in.nextInt();
        while(t-->0){
        	
        	int n=in.nextInt();
        	if(n<4){
        		System.out.println(-1);
        		return;
        	}
        	
        	int s[]=new int[n];        	
        	
        	for(int i=0; i < n; i++)            	            	
                s[i] = in.nextInt();                        	
        	
        	Arrays.sort(s);
        	n--;
        	int len=0, bre=0, c=0;
        	
        	while(n>0){
        		
        		if(s[n]==s[n-1]){
        			c++;
        		
        			if(c==1){
        				len=s[n];
        				n--;
        			}
        			if(c==2){
        				bre=s[n];
        				break;
        			}        			
        		}
        		n--;
        	}
        	int area=len*bre;
        	if(area==0)
        		System.out.println(-1);
        	else
        		System.out.println(area);        		
        	
        }
	}

}
