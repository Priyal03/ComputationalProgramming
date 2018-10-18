
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class LilElePermutation {
    public static void main(String args[]){          
    	
    	   
    	//Scanner sc = new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        
          int t;
		try {
			t = Integer.parseInt(br.readLine());
		
       
        
        while(t-->0)               
        {
        	
    		String str = br.readLine();
    		System.out.println(str);
    		
    		str = str.substring(0, 10);
    		
    		File file = new File("C:\\DevWorkspace\\Simplified\\files\\3_2684_log.txt");
    	//	Scanner scanner;
			try {
				//scanner = new Scanner(file);
				String lineFromFile = null;
				  BufferedReader fbr = new BufferedReader(new FileReader(file)); 
				while ((lineFromFile=fbr.readLine())!=null) {
		    		  // final String lineFromFile = scanner.nextLine();
		    		   if(lineFromFile.contains(str)) { 
		    		       // a match!
		    		       System.out.println("I found " +str+ " at " +lineFromFile);
		    		       break;
		    		   }
		    		}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
}