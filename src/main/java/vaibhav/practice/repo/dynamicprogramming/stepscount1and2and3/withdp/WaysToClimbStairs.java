package vaibhav.practice.repo.dynamicprogramming.stepscount1and2and3.withdp;

public class WaysToClimbStairs {

	public static void main(String[] args) {
		long n = 5;
		long[] s = new long[(int)n+1];

		// base case
		s[1] = 1;
		s[2] = 2;
		s[3] = 4;

		for (int i = 4; i <= n; i++) {
			s[i] = s[i - 1] + s[i - 2] + s[i-3];
		}

		System.out.println(s[(int)n]);
	}
}
