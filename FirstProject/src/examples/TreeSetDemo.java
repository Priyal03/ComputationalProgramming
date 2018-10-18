package examples;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> x = new TreeSet<String>();
		//Iterator iterator = (Iterator) x.iterator();
		x.add("Piku");
		x.add("Priyal");
		x.add("Prakriti");
		x.add("Abhishek");
		x.add("Hakuna Mmatata");
		x.add("MICO");
		x.add("Nita");
		x.add("Ninadu");
		x.add("Momma");
		x.add("Dadda");
		x.add("Abhlu");
		x.add("Foram");
		x.add("Piku");
		x.add("Piku");
		x.add("Piku");
		x.add("Piku");
		x.add("Piku");
		x.add("");
		x.add("");
		System.out.println("data"+x);
		
		Iterator it = x.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}	
}
