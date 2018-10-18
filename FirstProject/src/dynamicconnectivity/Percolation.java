package dynamicconnectivity;

public class Percolation {

	private int a[][];

	public Percolation(int n) {
		// create n-by-n grid, with all sites blocked
		a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = 0;
			}
		}
	}

	public void open(int row, int col){
		// open site (row, col) if it is not open already		
		if(a[row][col]==0)
			a[row][col]=1;
	}

	public boolean isOpen(int row, int col){
		// is site (row, col) open?
		if(a[row][col]==1)
			return true;
		else
			return false;
	}

	public boolean isFull(int row, int col){
		return false;
		// is site (row, col) full?
		
	}

	public int numberOfOpenSites() {
		return 0;
	}      // number of open sites

	public boolean percolates() {
		return false;
	}           // does the system percolate?

}
