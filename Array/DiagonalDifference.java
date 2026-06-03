package Array;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        int primary = 0, secondary = 0;

        for(int i = 0; i < n; i++) {
            primary += a[i][i];
            secondary += a[i][n - 1 - i];
        }

        System.out.println("Difference = " + Math.abs(primary - secondary));
    }
}