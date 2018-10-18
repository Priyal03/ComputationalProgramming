package dynamicconnectivity;

public class QuickUnionFind {

	private int[] id;

	public QuickUnionFind(int n) {
		// TODO Auto-generated constructor stub
		id = new int[n];
		for (int i = 0; i < n; i++)
			id[i] = i;
		union(0,n-1);
		union(0,n-2);
		union(1,n-3);
		union(1,n-4);
		System.out.println("Union Done");
	}

	public boolean isConnected(int p, int q) {
		// TODO Auto-generated method stub
		if (rootOf(p) == rootOf(q)) {
			return true;
		}
		return false;
	}

	public void union(int p, int q) {
		// TODO Auto-generated method stub
		int pRoot = rootOf(p);
		System.out.println("Union for "+p + " "+ q);
		int qRoot = rootOf(q);

		id[p] = qRoot;
	}

	private int rootOf(int i) {
		// TODO Auto-generated method stub
		System.out.println("rootOf "+i);
		while(i!=id[i])
			i=id[i];
		return i;
	}

}
