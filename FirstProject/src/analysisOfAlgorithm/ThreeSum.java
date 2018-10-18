package analysisOfAlgorithm;

import java.util.Scanner;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++)
			a[i] = (int) StdRandom.uniform(-1000000, 1000000);
		StopWatch timer = new StopWatch();
		int cnt = ThreeSum.count(a);
		double time = timer.elapsedTime();
		System.out.println(cnt + " triples " + time);
	}

	static int count(int[] a) {
		// TODO Auto-generated method stub
		int N = a.length;
		int cnt = 0;
		for (int i = 0; i < N; i++)
			for (int j = i + 1; j < N; j++)
				for (int k = j + 1; k < N; k++)
					if (a[i] + a[j] + a[k] == 0)
						cnt++;
		return cnt;
	}

}
