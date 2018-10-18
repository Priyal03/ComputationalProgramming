package examples;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class LilElePermutation {
    public static void main(String args[]) throws IOException{          
    	
    	   
    	//Scanner sc = new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        
        int t=Integer.parseInt(br.readLine());        
        while(t!=0)               
        {
            int n=Integer.parseInt(br.readLine());
            int a[]=new int[n];
            int x=0,y=0;
            StringTokenizer str=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(str.nextToken());
            }
            if(n==1)
            {
                System.out.println("Yes");
                t--;
                continue;
            }            
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i<j)
                    {
                        if(a[i]>a[j])
                            x++;                        
                    }
                }                
            }
            for(int i=0;i<n-1;i++)
            {
                if(a[i]>a[i+1])
                    y++;
            }
            if(y==x)
                System.out.println("Yes");
            else
                System.out.println("No");
            t--;
        }
    }
}