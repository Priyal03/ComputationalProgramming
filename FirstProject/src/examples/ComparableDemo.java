package examples;

class HDTV implements Comparable<HDTV>{

	int size;
	long resolution;
	double price;
	String brand;
	
	public HDTV(int size, String brand, long resolution, double price){
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
	
	@Override
	public int compareTo(HDTV o) {
		// TODO Auto-generated method stub
		
		if(this.getSize() > o.getSize()){
			return 1;
		}
		else if(this.getSize() < o.getSize()){
			return -1;
		}
		else
			return 0;
	}

}

public class ComparableDemo{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDTV tv1=new HDTV(55, "Samsung",1000,100000);
		HDTV tv2=new HDTV(50, "Sony",700, 90000);
		
		if(tv1.compareTo(tv1)>0){
			System.out.println(tv1.getBrand()+" is Better than "+tv2.getBrand());
		}
		else{
			System.out.println(tv2.getBrand()+" is Better than "+tv1.getBrand());
		}
		

	}
}
