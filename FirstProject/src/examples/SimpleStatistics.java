package examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SimpleStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		try{
        int n,k, t=Integer.parseInt(br.readLine());
        
        while(t-->0){
        	
        	String[] sd=br.readLine().split( " " );                   
			n=Integer.parseInt(sd[0]);
			k=Integer.parseInt(sd[1]);  
			
        	float sum=0, a[]=new float[n];
        	StringTokenizer str=new StringTokenizer(br.readLine());
        	for(int i=0;i<n;i++){
        		a[i]=Float.parseFloat(str.nextToken());
        		sum=sum+a[i];
        	}        	        
        
        		Arrays.sort(a);         		
        		for(int i=0;i<k;i++){
        			sum=sum-a[i]-a[n-1-i];
        		}        		
        		System.out.println(sum/(n-2*k));
        	}
		}catch(Exception e){
			System.out.println("Error");
		}
        }
	

}
