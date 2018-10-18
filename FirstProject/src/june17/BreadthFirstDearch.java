package june17;

public class BreadthFirstDearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graph g = new Graph(4);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		
		System.out.println("Following is BFS Strarting from Vertex 2");
		g.BFS(2);
		System.out.println(1.65*100/6.2);
	}
}
