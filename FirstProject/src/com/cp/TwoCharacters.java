package com.cp;import java.util.HashSet;
import java.util.Scanner;

public class TwoCharacters {

	/**
	 * the steps are 1) take different chars 2) take 2 chars
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		String str = in.next();

		HashSet<Character> ch = new HashSet<Character>();
		int ans = 0;

		if (t < 2) {
			System.out.println(ans);
			return;
		}

		char prevChar = str.charAt(0);
		ch.add(prevChar);

		for (int i = 1; i < t; i++) {

			char c = str.charAt(i);
			if (prevChar == c)
				ch.remove(c);
			else
				ch.add(c);
			prevChar = c;
			// System.out.println(ch);
		}

		Character[] chars = ch.toArray(new Character[0]);

		for (int i = 0; i < chars.length - 1; i++) {

			for (int j = i + 1; i < chars.length; j++) {

				int len = getTwoCharLength(str, chars[i], chars[j]);

				if (len > ans)
					ans = len;
			}
		}
		System.out.println(ans);
	}

	private static int getTwoCharLength(String str, Character a, Character b) {
		// TODO Auto-generated method stub

		int length = 0;

		char prevChar = str.charAt(0);

		if (prevChar == a || prevChar == b) {
			length++;
		}

		for (int i = 1; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c != a && c != b)
				continue;

			if (c == prevChar)
				return 0;

			prevChar = c;
			length++;
		}
		return length;

	}

}