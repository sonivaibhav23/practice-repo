package vaibhav.practice.repo.dynamicprogramming.stepscount1and2.withdp;

public class ClimbStairs {

	public static void main(String[] args) {
		long n = 100;
		long[] s = new long[(int)n+1];

		// base case
		s[1] = 1;
		s[2] = 2;

		for (int i = 3; i <= n; i++) {
			s[i] = s[i - 1] + s[i - 2];
		}

		System.out.println(s[(int)n]);
	}
}
