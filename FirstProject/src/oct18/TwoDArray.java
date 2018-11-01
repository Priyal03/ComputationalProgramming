package oct18;

import java.util.Scanner;

public class TwoDArray {
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
    
		int t = in.nextInt();
	
		String array[][] = new String[t][2];
		boolean added = false;
		
		String str = in.next();
		array[0][0]=str;
		array[0][1]=String.valueOf(1);
		
		for(int i=1;i<t;i++){
			
			str = in.next();
			added = false;
			
			for(int j=0;j<i;j++){
				
				if(str.equals(array[j][0])){
					
					array[j][1]=String.valueOf(Integer.parseInt(array[j][1])+1);
					added = true;
					break;
				}
			}
			if(!added){

				array[i][0] = str;
				array[i][1] = String.valueOf(1);
				
			}
			
		}
		for(int i=0;i<t;i++){
			if(array[i][0]!=null){
				System.out.println(array[i][0]+" "+array[i][1]);
			}
		}
	}
	
}
