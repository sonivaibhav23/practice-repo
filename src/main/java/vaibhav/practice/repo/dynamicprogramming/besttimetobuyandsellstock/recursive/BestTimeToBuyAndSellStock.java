package vaibhav.practice.repo.dynamicprogramming.besttimetobuyandsellstock.recursive;

public class BestTimeToBuyAndSellStock {

    /**
     * The solution would be like
     * if A[n] is holding day wise values for n days. A[1...n]
     *
     * so for a day i there are two conditions
     * 1. I sell it on day i
     * 2. or I don't
     *
     * so when I sell it means the max profit that I can earn is
     *
     * P(i) = A[i] - Math.min(A[i], A[i-1], A[i-2], ..., A[1])
     *
     * and if I don't sell it on ith day then the max profit was till i-1 th day is P(i-1)
     *
     * so the max profit for a day i will be
     *
     * P(n) = Math.max(A[i] - Math.min(A[i], A[i-1], A[i-2], ..., A[1]), A[i-1])
     *
     */


    public static void main(String[] args) {
         int [] dayWisePrice = new int[] {12, 3, 26, 8, 10};
//        int [] dayWisePrice = new int[] {14, 13, 11, 9, 5};

        int maxProfit = calculateMaxProfit(dayWisePrice.length, dayWisePrice);
        System.out.println(maxProfit);
    }

    

    private static int calculateMaxProfit(int n, int[] dayWisePrice) {
        // base condition
        if(n == 0) return 0;
        int maxVal = calculateMaxProfit(n-1, dayWisePrice);
        for(int i = 1; i < n; i++) {
            maxVal = Math.max(maxVal, dayWisePrice[n-1] - dayWisePrice[i-1]);
        }
        return maxVal;
    }
}
