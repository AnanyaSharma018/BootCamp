
import java.util.*;

public class RainWaterTrapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter heights:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int water = 0;

        for (int i = 1; i < n - 1; i++) {

            int leftMax = arr[i];
            for (int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, arr[j]);
            }

            int rightMax = arr[i];
            for (int j = i + 1; j < n; j++) {
                rightMax = Math.max(rightMax, arr[j]);
            }

            water += Math.min(leftMax, rightMax) - arr[i];
        }

        System.out.println("Trapped Water = " + water);

        sc.close();
    }
}