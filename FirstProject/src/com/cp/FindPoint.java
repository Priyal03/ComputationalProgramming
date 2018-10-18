package com.cp;import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindPoint {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {

			int px = in.nextInt();
			int py = in.nextInt();
			int qx = in.nextInt();
			int qy = in.nextInt();
			int rx, ry = 0;

			rx = 2 * qx - px;
			ry = 2 * qy - py;

			System.out.println(rx + " " + ry);
		}
	}
}