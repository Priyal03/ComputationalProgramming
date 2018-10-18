package dynamicconnectivity;

import java.util.Scanner;

//Eager approach
// for dynamic Connectivity

public class QuickFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();		
		
		WeightedQuickUnionFind quf = new WeightedQuickUnionFind(n);
		
		if(sc.hasNext()){
			int p = sc.nextInt();
			int q = sc.nextInt();
			quf.union(2,6);
			if(quf.isConnected(p, q)){
				System.out.println(true);
			}else{
				quf.union(p,q);				
				System.out.println(p+"  "+q);
//				System.out.println("pRoot "+ quf.rootOf(p)+" qRoot "+quf.rootOf(q));
			}
		}		
	}
}
