package examples;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndTheBeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int nt=0, nf=0;
        StringBuilder sb;
        for(int a0 = 0; a0 < t; a0++){
        	sb=new StringBuilder();
            int n = in.nextInt();
            if(n==1){
            	System.out.println(-1);
            }else{
            if(n%3==0){
            	nf=n;
            }else if(n%5==0){
            	nt=n;            	
            }else{
            	nf=n;
            	do{            		
            		
            		nt++;
            		nf--;
            		
            		
            	}while(nf%3!=0);
            	
            	while(nt%5!=0){
            		nt++;
            		nf--;
            		
            	}
            }
            for(int i=0;i<n;i++){
            	
            	if(i<nf){
            		sb.append(5);
            	}
            	else
            		sb.append(3);            	
            }
            System.out.println(sb.toString());  
            
            }
        }
    }
}

//