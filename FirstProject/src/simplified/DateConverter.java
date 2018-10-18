import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;


public class DateConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
		
		//int n = sc.nextInt();	

		Long input = sc.nextLong();
		
		System.out.println(getDate(input, "dd/MM/yyyy hh:mm:ss.SSS"));
		
	}
	public static String getDate(long milliSeconds, String dateFormat)
	{
	    // Create a DateFormatter object for displaying date in specified format.
	    SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
	    formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
	    // Create a calendar object that will convert the date and time value in milliseconds to date. 
	     Calendar calendar = Calendar.getInstance();
	     calendar.setTimeInMillis(milliSeconds);
	     return formatter.format(calendar.getTime());
	}	
}
