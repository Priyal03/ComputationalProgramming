package april2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BearAndAB {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        
        int t=Integer.parseInt(br.readLine());        
        while(t-->0)               
        {
        	String[] sd=br.readLine().split( " " );
        	int n=0; long k=0;
        	
            for(int i=0;i<2;i++)
            {
                n=Integer.parseInt(sd[0]);
                k=Long.parseLong(sd[1]);
            }
                
            String s=br.readLine();
                        
            long na=0, nb=0, count=0, ans = 0; int j=0;
            char[] a=new char[n];            
            a =	s.toCharArray();            
            
            for(int i=0;i<n;i++){
            	if(a[i]=='a')
            		na++;
            	else if(a[i]=='b'){
            		nb++;
            		count+=na;
            	}
            	if(a[j]=='a' && (j+1)<n){
            		if(a[j+1]=='b')
            			ans = count*k;
            	}            	
            	ans += k*(k-1)/2*na*nb;
            	j++;
            }
            System.out.println(count * k + na * nb * (k * (k - 1)) / 2);
        }
	}

}
