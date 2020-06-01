package vaibhav.practice.repo.dynamicprogramming.knapsack.dp;

public class KnapSack {

    public static void main(String[] args) {
        int [] v = new int [] {14, 10, 2, 8, 6};
        int [] w = new int [] {10, 2, 13, 14, 9};

        int W = 15;

        int maxValueOfKnapsack = maxValueOfKnapsack(v.length, v, w, W);
        System.out.println(maxValueOfKnapsack);
    }

    private static int maxValueOfKnapsack(int n, int[] v, int[] w, int W) {
        int [][] R = new int[n + 1][W + 1];

        for(int i = 1; i<= n; i++) {
            for(int j=1; j <= W; j++) {
                if(j - w[i-1] >= 0 && v[i-1] + R[i-1][j- w[i-1]] > R[i-1][j]) {
                    R[i][j] = v[i - 1] + R[i-1][j- w[i-1]];
                } else {
                    R[i][j] = R[i-1][j];
                }
            }
        }
        return R[n][W];
    }
}
