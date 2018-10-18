package examples;

import java.util.Scanner;

public class NewDigits {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String n = in.next();
            int len=n.length();
            
            int count=0;
            int x[]=new int[len];   
            int num=Integer.parseInt(n);
            for(int i=0;i<len;i++){
            	
            	x[i]=n.charAt(i)-48; 
            	try{
            	if(num%x[i]==0){
            		
            		count++;            		
            	} 
            	}catch(ArithmeticException e){
            		
            	}
            }
            if(count>0)
            	System.out.println(count);
            else
            	System.out.println(count);
        }
    }
	
}
