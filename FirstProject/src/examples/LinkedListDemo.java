package examples;

import java.awt.List;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		LinkedList<Integer> x = new LinkedList<Integer>();
//		List l = new List();
//		l.add("helloooo");
//		x.addAll(Integer.parseUnsignedInt(l));
		
		x.add(0);
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
		System.out.println((t2-t1)/1000); //1534
	}

}
