package vaibhav.practice.repo.dynamicprogramming.besttimetobuyandsellstock.dp;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
//        int [] prices = new int[] {12, 3, 26, 8, 10}; // output : 23
//        int [] prices = new int[] {14, 13, 11, 9, 5}; // output : 0
//        int [] prices = new int[] {44, 13, 24, 42, 90}; // output : 77
//        int [] prices = new int[] {44, 13, 24, 90, 42}; // output : 77
        int [] prices = new int[] {44, 13, 90, 24, 42}; // output : 77

        int maxProfit = profitOrderOfNSqualSolution(prices);
        System.out.println(maxProfit);
    }

    private static int profitOrderOfNSqualSolution(int[] prices) {
        int [] dp = new int[prices.length];

        dp[0] = 0;
        dp[1] = Math.max(prices[1] - prices[0], 0);

        for (int i = 2; i < prices.length; i++) {
            int minVal = prices[i];
            for(int j = i-1; j >= 1; j--) {
                minVal = Math.min(minVal, prices[j]);
            }
            dp[i] = Math.max(prices[i] - minVal, dp[i-1]);
        }

        return dp[prices.length - 1];
    }

    private static int profitOrderOfNSolution(int[] prices) {
        int [] dp = new int[prices.length];

        dp[0] = 0;
        int minVal = prices[0];
        for (int i = 2; i < prices.length; i++) {
            minVal = Math.min(minVal, prices[i]);
            dp[i] = Math.max(prices[i] - minVal, dp[i-1]);
        }

        return dp[prices.length - 1];
    }
}
