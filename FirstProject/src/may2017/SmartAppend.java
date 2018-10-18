package may2017;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			arr.add(i);
		}

		int n = a.length;
		int temp = n;

		if (n > 700) {
			sb.append(" 700 times ");
			temp = temp - 500;
		}
		if (temp > 100) {
			sb.append("100 times ");
			temp = temp - 100;
		}
		for (int i = temp; i > 0; i--)
			sb.append(" # " + arr.remove(i));

		System.out.println(sb + " " + arr);
	}

}
