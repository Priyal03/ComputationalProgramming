/**
 * 
 */
package oct18;

import java.util.Arrays;

/**
 * @author ppatel65
 *
 */
public class MergeArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]={1,2,3,4,5,9,0,0,7};
		int b[]={4,5,6};
		
		StringBuffer
		
		System.arraycopy(array, 0, b, b.length-1, 1);
				int c[] = Arrays.copyOf(array, 4);//merge(array,b);
		
		for(int x:c){
			System.out.println(x);
		}
		
		
	}
	
	public static int[]merge(int[]a, int[]b){
		  int[]c = new int[a.length+b.length];
		  int i;
		  for(i=0; i<a.length; i++)
		     c[i] = a[i];

		     for(int j=0; j<b.length; j++)
		        c[i++]=b[j];
		        return c;
		}
}
