package Array;
import java.util.Scanner;

public class SwapRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        
        for(int j = 0; j < c; j++) {
            int temp = a[0][j];
            a[0][j] = a[r - 1][j];
            a[r - 1][j] = temp;
        }

        
        for(int i = 0; i < r; i += 2) {
            for(int j = 0; j < c; j++) {
                a[i][j] = -a[i][j];
            }
        }

       
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}