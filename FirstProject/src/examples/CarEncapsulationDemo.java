package examples;
//Demonstrate the Encapsulation
class CarEncapsulationDemo  
{
	public static void main(String[] args) 
	{
		CarEncapsulation cDemo = new CarEncapsulation();
		cDemo.setEngine("Suzuki");
		cDemo.setColor("Red");
		cDemo.start();
		cDemo.changeGear();
		cDemo.stop();		
	}
}//class
