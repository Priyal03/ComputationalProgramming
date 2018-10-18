package dynamicconnectivity;

import java.awt.List;
import java.util.ArrayList;

public class WeightedQuickUnionFind {

	private int[] id, size;

	public WeightedQuickUnionFind(int n) {
		// TODO Auto-generated constructor stub
		id = new int[n];
		size = new int[n];
		for (int i = 0; i < n; i++)
			id[i] = i;
		union(0, n - 1);
		union(0, n - 2);
		union(1, n - 3);
		union(1, n - 4);
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
		// System.out.println("Union for " + p + " " + q);

		int pRoot = rootOf(p);
		int qRoot = rootOf(q);

		// System.out.println("The size is " + size[pRoot] + " " + size[qRoot]);
		if (pRoot == qRoot)
			return;

		if (size[pRoot] < size[qRoot]) {
			id[pRoot] = qRoot;
			size[qRoot] = size[qRoot] + size[pRoot];
			// System.out.println("pRoot "+ rootOf(p)+" qRoot "+rootOf(q));
		} else {
			id[qRoot] = pRoot;
			size[pRoot] = size[qRoot] + size[pRoot];
			// System.out.println("pRoot "+ rootOf(p)+" qRoot "+rootOf(q));
		}
	}

	public int find(int n) {

		rootOf(n);
		int temp = n;
		for (int i = 0; i < id.length; i++) {
			if (rootOf(i) == rootOf(n)) {
				temp = (temp > i ? temp : i);
			}
		}
		return temp;
	}

	public int remove(int n) {

		return n;
	}

	public int rootOf(int i) {
		// TODO Auto-generated method stub
		System.out.println("rootOf " + i);

		while (i != id[i]) {
			System.out.println("i and id[i] " + i + " " + id[i]);
			i = id[i];

		}
		System.out.println("is " + i);
		return i;
	}

}
