package oct2017;

import java.util.Scanner;

public class StringAnagrams {

	/**
	 * @param first
	 * @param second
	 * @return
	 */
	/**
	 * @param first
	 * @param second
	 * @return
	 */
	public static int numberNeeded(String first, String second) {
	  
		int ans = 0;
		
		int[] count = new int[26];
		
		for(char c : first.toCharArray()){
			count[c-'a']++;
		}
		for(char c : second.toCharArray()){
			count[c-'a']--;
		}
		for(int a : count){
			ans = ans + Math.abs(a);
		}
		return ans;
    }
  
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
