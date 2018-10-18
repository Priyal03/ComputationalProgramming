package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefAndHisSequence {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 		
		
			int t=Integer.parseInt(br.readLine());
        
			while(t-->0){
        
				int l=Integer.parseInt(br.readLine());
				String seq[]=br.readLine().split(" ");
				int f=Integer.parseInt(br.readLine());
				String fseq[]=br.readLine().split(" ");
				
				boolean flag=false;
				int j=0;
				for(int i=0;i<l;i++){
					if(j<f && Integer.parseInt(fseq[j])==Integer.parseInt(seq[i])){
						j++;
					}
					if(j==f){
						flag=true;
						break;
					}
				}
				if(flag){
        			System.out.println("YES");
        		}
	        	else
	        		System.out.println("NO");
			}
		
			
		}
	}