import java.util.Scanner;

/**
 * 
 */

/**
 * @author patelpri
 *
 */

public class GenerateString {
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Long x[] =  new Long[n];
		String a[] = new String[n];
		StringBuilder sb = new StringBuilder();
		sb.append("('");		

		for(int i=0; i<n; i++){			
			
			//x[i]=sc.nextLong();	
			a[i]=sc.next();
			sb.append(a[i]+"','");
		}
		
		System.out.println(sb.toString());
	}

}
