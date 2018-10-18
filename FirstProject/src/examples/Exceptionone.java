package examples;

public class Exceptionone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			int x=0;
			int y=5/x;		
		}catch(ArithmeticException e){
			System.out.println("Arithmatic Ex");
		}catch(Exception e){
			System.out.println("Exception");			
		}
		System.out.println("Finally");
	}
}
