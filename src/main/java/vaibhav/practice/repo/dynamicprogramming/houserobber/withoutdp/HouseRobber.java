package vaibhav.practice.repo.dynamicprogramming.houserobber.withoutdp;

public class HouseRobber {

    // This is not a working solution

    public static void main(String[] args) {
        int [] amounts = new int[] {10, 20, 30, 40};
        int robbedAmount = getMaxRobbery(4, amounts);
        System.out.println(robbedAmount);
    }

    private static int getMaxRobbery(int n, int[] amounts) {
        if(n==1) return amounts[0];

        int maxValue = -1;

        maxValue = Math.max(maxValue, getMaxRobbery(n - 1, amounts));

        for (int i = n-2; i >= 1; i--) {
            maxValue = Math.max(maxValue, getMaxRobbery(i, amounts) + amounts[i]);
        }
        return maxValue;
    }
}
