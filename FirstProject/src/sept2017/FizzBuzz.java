package sept2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        
        int t;
		try {
			t = Integer.parseInt(br.readLine());
		      
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
        }
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

}
