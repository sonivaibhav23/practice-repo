package vaibhav.practice.repo.dynamicprogramming.houserobber.withdp;

public class HouseRobber {

    public static void main(String[] args) {
        int [] amounts = new int[] {10, 20, 30, 40, 50};

        int maxRobbedAmount = getMaxRobbedAmoumt(amounts);
        System.out.println(maxRobbedAmount);
    }

    private static int getMaxRobbedAmoumt(int[] amounts) {
        if(amounts.length == 0) return 0;
        if(amounts.length == 1) return amounts[0];

        int [] rob = new int[amounts.length];

        rob[0] = amounts[0];
        rob[1] = Math.max(amounts[0], amounts[1]);

        for (int i = 2; i < amounts.length; i++) {
            rob[i] = Math.max(amounts[i] + rob[i-2], rob[i-1]);
        }

        return rob[amounts.length - 1];
    }
}
