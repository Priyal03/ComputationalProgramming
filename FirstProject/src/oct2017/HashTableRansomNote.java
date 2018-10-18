package oct2017;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashTableRansomNote {

	Map<String, Integer> magazineMap;
	Map<String, Integer> noteMap;

	public HashTableRansomNote(String magazine, String note) {
		magazineMap = new HashMap<String, Integer>();
		noteMap = new HashMap<String, Integer>();
		int i = 1;
		
		for (String word : magazine.split(" ")) {
			magazineMap.put(word, i);
			i++;
		}
		
		i=1;
		for(String word : note.split(" ")){
			noteMap.put(word, i);
			i++;
		}
	//	Collection<Integer> collection =Collection 
	}

	public boolean solve() {
		
		for(int i=0;i<noteMap.size();i++){
			Integer word = noteMap.get(i);
			if(magazineMap.containsKey(word)){
				noteMap.remove(i);
				magazineMap.remove(i);
			}
		}
    	
        return true;
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();

		// Eat whitespace to beginning of next line
		scanner.nextLine();

		HashTableRansomNote s = new HashTableRansomNote(scanner.nextLine(), scanner.nextLine());
		scanner.close();

		boolean answer = s.solve();
		if (answer)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}
