package vaibhav.practice.repo.dynamicprogramming.cuttingrode.withoutdp;

public class CuttingRods {

    public static void main(String[] args) {
        int n = 5;
        int [] prices = new int[] {2, 9, 12, 17, 20};

        int maxRevenue = getMaxRevenue(n, prices);
        System.out.println(maxRevenue);
    }

    private static int getMaxRevenue(int n, int[] prices) {
        // base condition
        if(n == 0) return 0;
        int maxRevenue = -1;

        for (int i = 0; i < n; i++) {
            int revenue = prices[n - i - 1] + getMaxRevenue(i, prices);
            if(revenue > maxRevenue) {
                maxRevenue = revenue;
            }
        }

        return maxRevenue;
    }
}
