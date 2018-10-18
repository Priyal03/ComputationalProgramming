import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */

/**
 
 *
 */ 
public class CompareAndDelete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);									
		StringBuilder sb = new StringBuilder();
		sb.append("(");
		
		//int length = (m>n?m:n);		
		int n = sc.nextInt();
		Long x[] =  new Long[n];
		for(int i=0; i<n; i++){
			
			x[i]=sc.nextLong();									
		}
		
		int m = sc.nextInt();
		Long y[] =  new Long[m];
		
		for(int i=0; i<m; i++){
			y[i]=sc.nextLong();
		}
		
		List<Long> original = new ArrayList(Arrays.asList(x));
		List<Long> newdiff = new ArrayList(Arrays.asList(y));
		
		for (Long s : y) {
            if (original.contains(s)) {
            	original.remove(s);
            } else {            	
            	sb.append(s+"','");
            }            
        }
		System.out.println("Difference " + sb.toString());
	}

}
