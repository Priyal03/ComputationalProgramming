package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class HDTV2{

	int size;
	long resolution;
	double price;
	String brand;
	
	public HDTV2(int size, String brand, long resolution, double price){
		this.size=size;
		this.brand=brand;
		this.resolution=resolution;
		this.price=price;
	}
	
	public int getSize(){
		return size;
	}

	public void setSize(int size){
		this.size=size;		
	}
	
	public String getBrand(){
		return brand;		
	}
	
	public void setBrand(String brand){
		this.brand=brand;
	}
	
	public long getResolution(){
		return resolution;		
	}
	
	public void setResolution(long Resolution){
		this.resolution=resolution;
	}
	
	public double getPrice(){
		return price;		
	}
	
	public void setPrice(double price){
		this.price=price;
	}
}
	
class SizeComparator implements Comparator<HDTV2>{
	
	@Override
	public int compare(HDTV2 o1, HDTV2 o2) {
		// TODO Auto-generated method stub
		
		if(o1.getSize()<o1.getSize()){
			return 1;			
		}
		else if(o1.getSize()>o1.getSize()){
			return -1;
		}
		else
			return 0;
	}

}

public class ComparatorDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDTV2 tv1=new HDTV2(55, "Samsung",1000,100000);
		HDTV2 tv2=new HDTV2(50, "Sony",700, 90000);		

		ArrayList<HDTV2> al = new ArrayList<HDTV2>();
		al.add(tv1);
		al.add(tv2);
		
		Collections.sort(al,new SizeComparator());
		
		for(HDTV2 a:al){
			System.out.println(a.getBrand());
		}
	
	}

}