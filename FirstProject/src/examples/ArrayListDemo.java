package examples;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(6);
		x.add(4);
		x.add(5);
		x.add(7);
		x.add(8);
		x.add(9);
		x.add(51);
		x.add(71);
		
		long t1=System.nanoTime();
		System.out.println(System.currentTimeMillis());
		System.out.println(x);
		System.out.println(x.get(3));
		System.out.println(x);
		long t2=System.nanoTime();
		System.out.println(System.currentTimeMillis());	
		System.out.println((t2-t1)/1000);//1301
	}

}
