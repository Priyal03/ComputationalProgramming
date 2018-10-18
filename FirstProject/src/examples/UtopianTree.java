package examples;

import java.util.Scanner;

class UtopianTree 
{   
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int sum=1;
            if(n==0){
            	System.out.println(1);
            }else{
            for(int i=1;i<=n;i++){
            	if(i%2==0){
            		sum++;
            	}else
            		sum=(2*sum);             	
            }
            System.out.println(sum);
        }}
    
    }
}
