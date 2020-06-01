package vaibhav.practice.repo.dynamicprogramming.stepscount1and2and3.withoutdp;

public class WaysToClimbStairs {

    public static void main(String[] args) {
        int n = 5;
        int ways = climbStairs(n);
        System.out.println(ways);
    }

    private static int climbStairs(int n) {
        // base cases
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 4;

        return climbStairs(n-1) + climbStairs(n-2) + climbStairs(n-3);
    }
}
