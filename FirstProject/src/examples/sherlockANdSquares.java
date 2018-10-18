package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sherlockANdSquares {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        
        int t=Integer.parseInt(br.readLine());        
        while(t-->0){
        	
        	StringTokenizer str=new StringTokenizer(br.readLine());
        	int l=Integer.parseInt(str.nextToken());
        	int h=Integer.parseInt(str.nextToken());
        	int count=0;
        	for(int i=l;i<=h;i++){
        		
        		int x=(int) Math.sqrt(i);
        		int p=x*x;
        		if(p==i)
        			count++;        		       		        			       
        		
    		}
        	System.out.println(count);
        }
	}
	
}
