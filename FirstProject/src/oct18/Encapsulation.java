package oct18;

import java.util.Scanner;

public class Encapsulation {
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
    
		int t = in.nextInt();
	
		Structure input[] = new Structure[t];
		//List<Struct> finalList = new ArrayList<Struct>();
		
		String str = in.next();
		
		Structure first = new Structure();
		first.setName(str);
		first.setOccurances(1);
		
		input[0] = first;
		
		
		
		for(int i=1;i<t;i++){
			
			str = in.next();
			
			for(int j=0;j<i;j++){
				
				if(input[j].getName().equals(str)){
					
					System.out.println(input[j].getName()+" present ");
					first=new Structure();
					
					first.setName(input[j].getName());
					first.setOccurances(input[j].getOccurances()+1);
					input[j]=first;
				}else{
					System.out.println(input[j].getName()+" new node ");
					first = new Structure();
					first.setName(str);
					first.setOccurances(1);
					input[i]=first;
				}
				//System.out.println(input[i].getName()+" "+input[i].getOccurances());
			}
			
		}
		for(int i=0;i<t;i++){
			System.out.println(input[i].getName()+" "+input[i].getOccurances());
		}
	}
	
}
