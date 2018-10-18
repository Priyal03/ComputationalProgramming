package examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import examples.EmpData;

public class PrepHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee m1=new Employee(1, "Priyal", 200000, 'A');
		Employee m2=new Employee(2, "Asha", 200000, 'A');
		Employee m3=new Employee(3, "Pal", 200000, 'A');
		Employee m4=new Employee(4, "Riyal", 200000, 'A');
		Employee m5=new Employee(5, "Pooja", 200000, 'A');
		Employee m6=new Employee(6, "Lina", 200000, 'A');
		Employee m7=new Employee(17, "Mina", 200000, 'A');
		Employee m8=new Employee(8, "Kinal", 200000, 'A');
		Employee m9=new Employee(9, "Kina", 200000, 'A');
		
		HashMap<Integer,Employee> h = new HashMap<Integer,Employee>();
		h.put(m1.id,m1);
		h.put(m2.id,m2);
		
		Iterator  iter = h.entrySet().iterator();
		
		while (iter.hasNext()) {
			Map.Entry map =  (Entry) iter.next();
			System.out.println(map.getKey() + " ::" + ((Employee)map.getValue()).name);
		}
		
		
	}

}
