package com.cp;import java.util.Scanner;


public class BreakingSticks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        long[] a = new long[n];
	        
	        
	        
	        for(int i = 0; i < n; i++){
	        	
	        	long result = 0;
	            a[i] = in.nextLong();
	            //int x = a[i];
	            if(isPrime(a[i])){
            		result = a[i]+1;
            	}else
            	{
            		for(int j=2;j<a[i]/2;j++){
            			
            			
            			if(a[i]%j==0){
            				
            			}
            		}
	            	
	            	break;
	            }
	            
	            System.out.println(result);
	        }
	        
	        
	        
	        
	        in.close();
	    
	}
	
	public static boolean isPrime(long a) {

		if (a < 2)
			return false;

		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0)
				return false;
		}
		return true;
	}

}
