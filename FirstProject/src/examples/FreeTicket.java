package examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.PriorityQueue;

public class FreeTicket {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int cities, flights;
		int x,y,f;
		PriorityQueue<weights> cost;
		
		try{
			
			BufferedReader test=new BufferedReader(new InputStreamReader(System.in));
			String[] sd=test.readLine().split( " " );                   
			cities=Integer.parseInt(sd[0]);
			flights=Integer.parseInt(sd[1]);  
			
			for(int i=0; i<flights; i++){
				
				String[] ip = test.readLine().split(" ");
				x= Integer.parseInt(ip[0]);
				y= Integer.parseInt(ip[1]);
				f= Integer.parseInt(ip[2]);
			}
			
		}catch(Exception e){
			System.out.println("Error");
		}
	}

}

class weights implements Comparable<weights>{
	
	HashSet<weights> edges;
	
	public weights() {
		// TODO Auto-generated constructor stub
		edges = new  HashSet<weights>();
	}	
	
	@Override
	public int compareTo(weights o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
