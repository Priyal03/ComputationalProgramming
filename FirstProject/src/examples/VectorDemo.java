package examples;

import java.util.Vector;

public class VectorDemo {

	public static void main(String args[]){
		
		Vector v = new Vector<Object>(3,2);
		
		System.out.println("Size :"+ v.size()+"\nCapacity :"+v.capacity());
		
		v.addElement(new String("Pri"));
		v.addElement(new String("Piku"));
		v.addElement(new String("Abhi"));
		v.addElement(new String("Ninu"));
		
		System.out.println("Capacity after four Addition :"+v.capacity()+"\nSize :"+v.size() );
		
	}
}
//capacity
//1--- 5
//2--- 4
//3--- 5 
//if capacity is 3 then it will add 2 when it reaches the max so.. 5,7,9