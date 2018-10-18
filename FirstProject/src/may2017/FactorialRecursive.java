package may2017;

public class FactorialRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		
		int x = factorial(i);
		
		System.out.println(x);
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		System.out.println(n + " n");
		int c;
		if(n==0)
			return 1;
		else		
			c= n*factorial(n-1);
		System.out.println(c + " C");
			return c;
		
	}

}
