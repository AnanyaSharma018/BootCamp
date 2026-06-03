package String;
import java.util.Scanner;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = s.length();

        int[][] dp = new int[n][n];

        for(int i = 0; i < n; i++)
            dp[i][i] = 1;

        for(int len = 2; len <= n; len++) {
            for(int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                if(s.charAt(i) == s.charAt(j)) {
                    if(len == 2)
                        dp[i][j] = 2;
                    else
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        System.out.println("Length of Longest Palindromic Subsequence = " + dp[0][n - 1]);
    }
}