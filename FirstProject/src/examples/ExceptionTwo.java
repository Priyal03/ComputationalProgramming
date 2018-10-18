package examples;

public class ExceptionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			badMethod();
			System.out.println("A");
		}catch(Exception e){
			System.out.println("B");			
		}finally{
			System.out.println("C");			
		}
		System.out.println("D");
	}

	private static void badMethod() throws SomeException {
		// TODO Auto-generated method stub
		throw new SomeException();//going to new class
	}

}