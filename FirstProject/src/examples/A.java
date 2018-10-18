package examples;

import java.util.logging.Logger;

class A{
	
	int data=40;
	
	int getData(){
		return data;
	}
	
	public void msg(){
		System.out.println("Hello World");
		Logger x=Logger.getLogger("me");
		
	}
}

//download apache log4j