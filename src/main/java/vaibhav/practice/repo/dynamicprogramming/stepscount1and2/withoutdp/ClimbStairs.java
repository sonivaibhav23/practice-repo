package vaibhav.practice.repo.dynamicprogramming.stepscount1and2.withoutdp;

public class ClimbStairs {

    public static void main(String[] args) {
        int n = 40;
        int ways = climbStairs(n);
        System.out.println(ways);
    }

    private static int climbStairs(int n) {
        // base cases
        if(n == 1) return 1;
        if(n == 2) return 2;

        return climbStairs(n-1) + climbStairs(n-2);
    }
}
