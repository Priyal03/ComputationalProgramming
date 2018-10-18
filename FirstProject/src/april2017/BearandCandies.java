/**
 * 
 */
package april2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author patelpri
 *
 */
public class BearandCandies {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        
        int t=Integer.parseInt(br.readLine());        
        while(t-->0)               
        {        	
            int l=0,b=0;
            int limak=0, bob=0;
            String[] sd=br.readLine().split( " " );
            for(int i=0;i<2;i++)
            {
                l=Integer.parseInt(sd[0]);
                b=Integer.parseInt(sd[1]);
            }
            
            int i=1;
            
            while(true){
            	if(i%2==0){
            		bob+=i;
            		if(b<bob){
            			System.out.println("Limak");
            			break;
            		}
            	}else{
            		limak+=i;
            		if(limak>l){
            			System.out.println("Bob");
            			break;
            		}
            	}
            	i++;
            }            
        }
	}

}
