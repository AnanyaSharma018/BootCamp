package Array;
import java.util.Scanner;

public class ArraySubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = arr[arr.length - 1] - arr[0];

        System.out.println("Result = " + result);
    }
}