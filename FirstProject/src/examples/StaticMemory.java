package examples;

public class StaticMemory{

	static{
		classvariable=10;
	}
	
	
	static int classvariable;
	
	public static void main(String args[]){

		System.out.println("Classvariable : "+classvariable);
		
		//System.out.println(localvariable);
		
		int localvariable = 1;				
	}
}