package vaibhav.practice.repo.dynamicprogramming.cuttingrode.withdp;

public class CuttingRods {

    public static void main(String[] args) {
        int n = 5;
        int [] prices = new int[] {2, 9, 12, 17, 20};

        int maxRevenue = getMaxRevenue(n, prices);
        System.out.println(maxRevenue);
    }

    private static int getMaxRevenue(int n, int[] prices) {
        int [] revenues = new int[n+1];
        // base condition
        revenues[0] = 0;

        for (int i = 1; i <= n; i++) {
            int maxRevenue = -1;
            for(int j = 1; j <= i; j++) {
                int revenue = prices[j-1] + revenues[i-j];
                if (revenue > maxRevenue) {
                    maxRevenue = revenue;
                }
            }
            revenues[i] = maxRevenue;
        }
        return revenues[n];
    }
}
