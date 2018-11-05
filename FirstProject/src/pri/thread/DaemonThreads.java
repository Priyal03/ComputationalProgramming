/**
 * 
 */
package pri.thread;

/**
 * @author priyal
 *
 */
public class DaemonThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		UserThead t = new UserThead();
		if(!t.isDaemon()){
			System.out.println(" It is User yet! ");
		}
		
		t.setDaemon(true);	
		t.start();
		
		if(t.isDaemon()){
			System.out.println(" It is Daemon now. ");
		}
	}
}

class UserThead extends Thread{
	
	public void run(){
		System.out.println("Executing from User Thread !!! ");
	}
}
