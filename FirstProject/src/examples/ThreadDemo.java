package examples;

public class ThreadDemo implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++){
			
			System.out.println("This is Thread "+i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    System.out.println("Main thread :1 " );
         
		Thread t,t1,t2;
		t = new Thread(new ThreadDemo());
		t.start();
		
		t1 = new Thread(new ThreadDemo());
		t1.start();
		
		System.out.println("Main thread :2 " );
		
		t2 = new Thread(new ThreadDemo());
		t2.start();
		
		System.out.println("Main thread :3 " );
         
	}

}
