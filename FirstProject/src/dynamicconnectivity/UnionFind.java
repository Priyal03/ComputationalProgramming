package dynamicconnectivity;

public class UnionFind {

	private int[] id;
	public UnionFind(int n) {
		// TODO Auto-generated constructor stub
		id = new int[n];
		for(int i=0;i<n;i++){
			id[i]=i;
		}
		union(0,n-2);
		union(1,n-1);
		union(0,n-1);
	}
	
	public boolean isConnected(int p, int q) {
		// TODO Auto-generated method stub
		if(id[p]==id[q]){
			return true;
		}
		return false;
	}
	
	public void union(int p, int q) {
		// TODO Auto-generated method stub
		int pid=id[p];
		int qid=id[q];
		
		for(int i=0;i<id.length;i++){
			if(id[i]==pid){
				id[i]=qid;
			}
		}
	}

}
