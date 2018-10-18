package examples;

import java.util.Scanner;

public class TheSmallestPair {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     
        int t=in.nextInt();
        
        while(t-->0){
        	int n=in.nextInt();
        	int a[]=new int[n];
        	for(int i=0;i<n;i++){
        		a[i]=in.nextInt();
        	}
        	int sum=0;
        	int ans=a[0]+a[1];
        	for(int i=2;i<n;i++){
        		sum=a[i-1]+a[i];
        		if(ans>sum){
        			ans=sum;
        		}
        	}
        	System.out.println(ans);
        }
	}
}
