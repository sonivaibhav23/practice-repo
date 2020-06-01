package vaibhav.practice.repo.dynamicprogramming.longestcommonstring.dp;

/**
 * sudo code
 *
 * if we have X[1...n] and Y[1...m] two strings
 * then to calculate longest common substring
 * lets assume that M[i][j] is having max length where max common substring is ending in X[i] and Y[j]
 *
 * so the solution here is like
 *
 * if(X[i] = Y[j]) then M[i][j] = M[i-1][j-1] + 1;
 * and if X[i] != Y[j] then M[i][j] = 0;
 *
 *
 * so the function will be like
 *              {
 *  M[i][j] =   {   M[i-1][j-1] + 1 , X[i] =  Y[j]
 *              {   0               , X[i] != Y[j]
 *
 */

public class LongestCommonSubstring {

    public static void main(String[] args) {
        String x = "DEADBEER";
        String y = "EATBEER";
        int[][] l = new int[x.length() + 1][y.length() + 1];
        int maxLength = Integer.MIN_VALUE;

        for(int i=1; i <= x.length(); i++) {
            for (int j=1; j <= y.length(); j++) {
                if(x.charAt(i - 1) == y.charAt(j - 1)) {
                    l[i][j] = l[i - 1][j - 1] + 1;
                }
                else
                    l[i][j] = 0;

                if(maxLength < l[i][j])
                    maxLength = l[i][j];
            }
        }

        System.out.println("Max sub string's length : " + maxLength);
    }
}
