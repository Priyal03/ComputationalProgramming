package examples;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo implements Iterator<String>{

	public static void main(String args[]){
		
		HashSet<String> x = new HashSet<String>();
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
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
}
 