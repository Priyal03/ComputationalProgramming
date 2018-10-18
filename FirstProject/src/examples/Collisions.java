package examples;

import java.util.Scanner;

public class Collisions {

    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);        
        int t=in.nextInt();
        while(t-->0){
        	
        	int n=in.nextInt();
        	int m=in.nextInt();
        	
        	String arr[] = new String[n];
        	int count=0, ans=0;
            
            for(int i=0; i < n; i++){            	
                                	
                    arr[i] = in.next();    
                                                                           
            }                                             
            
            for(int j=0; j < m; j++){
            	
            	count=0;
            	for(int i=0; i < n; i++){
            		
            		if(arr[i].charAt(j)=='1'){
                    	
            			count++;
                    }                	               		   
            	}
            	if(count>1){
            		
           			ans=ans+(count*(count-1))/2;
           		}
            	       
            }                            
            System.out.println(ans);            
        }                      
    }    
}
