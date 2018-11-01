package oct18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Paypal {
	
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
    
		int t = in.nextInt();
	
		String input = null;
		Map<String, Integer> occurances = new HashMap<String, Integer>();
	
		for(int i=0;i<t;i++){
			
			input = in.next();
			if(occurances.containsKey(input)){
				
				occurances.put(input, occurances.get(input)+1);
				
			}
			else{
				occurances.put(input, 1);
			}
			
		}
		System.out.println(occurances);
	
	}
}
