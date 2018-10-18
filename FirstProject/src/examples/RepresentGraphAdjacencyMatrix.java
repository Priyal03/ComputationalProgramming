package examples;

import java.util.Scanner;

public class RepresentGraphAdjacencyMatrix {
	
	private final int vertices;
	private int[][] adjacency_matrix;

	public RepresentGraphAdjacencyMatrix(int v) {
		// TODO Auto-generated constructor stub
		
		vertices = v;
		adjacency_matrix=new int[vertices+1][vertices+1];
		
	}
	
	public void makeEdge(int from, int to, int edge){
		
		try{
			
			adjacency_matrix[from][to]=edge;
			
		}catch(ArrayIndexOutOfBoundsException index){
			
			System.out.println("The vertices does not exist");
			
		}
	}

	public int getEdge(int from, int to){
		
		try{
			
			return adjacency_matrix[from][to];
			
		}catch(ArrayIndexOutOfBoundsException index){
			
			System.out.println("The vertices does not exist");
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v, e, count=1, to=0, from=0, w=0;
		Scanner sc = new Scanner(System.in);
		
		RepresentGraphAdjacencyMatrix graph;
		
		try{
			
			 System.out.println("Enter the number of vertices: ");
			 v=sc.nextInt();
			 System.out.println("Enter the number of edges: ");
			 e=sc.nextInt();
			 
			 graph = new RepresentGraphAdjacencyMatrix(v);
			 
			 System.out.println("Enter the edges : <from> <to>: ");
			 
			 while(count<=e){
				 
				 from = sc.nextInt();
				 to=sc.nextInt();
				 w=sc.nextInt();				
				 
				 graph.makeEdge(from, to, w);
				 count++;
			 }
			 
			 System.out.println("The adjacency matrix for the given graph is: ");
			 System.out.print("\t");
			 
			 for(int i=1;i<=v;i++){
				 
				 System.out.print(i+"\t");
			 }
			 
			 System.out.println();
			 
			 for(int i=1;i<=v;i++){
				 
				 System.out.print(i+"\t");
				 
				 for(int j=1;j<=v;j++){
					 System.out.print(graph.getEdge(i, j)+"\t");
				 }
				 
				 System.out.println();
			 }
			 								 
		}catch(Exception E){
			 System.out.println("Errrrrrroooooorrrrr");
		}
		sc.close();
	}

}
