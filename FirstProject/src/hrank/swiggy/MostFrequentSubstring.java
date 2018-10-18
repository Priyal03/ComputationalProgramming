package hrank.swiggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MostFrequentSubstring {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		int minLength = Integer.parseInt(bufferedReader.readLine().trim());

		int maxLength = Integer.parseInt(bufferedReader.readLine().trim());

		int maxUnique = Integer.parseInt(bufferedReader.readLine().trim());

		int result = Result.getMaxOccurrences(s, minLength, maxLength,
				maxUnique);

		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();
		System.out.println(result);
		bufferedReader.close();
		// bufferedWriter.close();
	}
}

class Result {

	/*
	 * abcde
	 */

	  public static int getMaxOccurrences(String s, int minLength, int maxLength,
	            int maxUnique) {

	        String sub = null;
	        int length = 0;
	        Set<Character> uniques = null;
	        Map<String, Integer> occur = new HashMap<String, Integer>();
	        
	        for (int i =0; i < s.length(); i++) {

	            for (int j = i + 1; j <= s.length(); j++) {

	                sub = s.substring(i, j);
	                length = sub.length();
	                

	                if (length >= minLength && length <= maxLength) {

	                    uniques = new HashSet<Character>();

	                    while( length-->0) {
	                        if (!uniques.contains(sub.charAt(length))) {
	                            uniques.add(sub.charAt(length));
	                        }
	                    }
	                    if (uniques.size() <= maxUnique) {
	                        if (occur.containsKey(sub)) {
	                            occur.put(sub, occur.get(sub) + 1);
	                        } else
	                            occur.put(sub, 1);
	                    }
	                }
	            }
	        }
	        return (Collections.max(occur.values()));
	  }
}