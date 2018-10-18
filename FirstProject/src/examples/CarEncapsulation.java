package examples;

//Demonstrate the encapsulation concept
class CarEncapsulation 
{
	//instance variable to make it secure
	private String engine;
	private String color;
	private int noOfWheels;

	public boolean start(){
		System.out.println(color +" car is starting...");

		return true;
	}
	public boolean stop(){
		System.out.println(color +" car is stoping...");

		return true;
	}
	public boolean changeGear(){
		System.out.println(color +" car is changing gear...");

		return true;
	}

	//getters and setters
	public String getEngine(){
		return engine;
	}
	public void setEngine(String e){
		engine = e;
	}

	public String getColor(){
		return color;
	}
	public void setColor(String c){
		color = c;
	}

	public int getNoOfWheels(){
		return noOfWheels;
	}
	public void setNoOfWheels(int n){
		noOfWheels = n;
	}
	
}//class
