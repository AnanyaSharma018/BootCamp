import java.util.Scanner;

class SlidingWindowMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter window size (k): ");
        int k = sc.nextInt();

        System.out.println("Maximum elements in each window:");

        for(int i = 0; i <= n - k; i++) {
            int max = arr[i];

            for(int j = i; j < i + k; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                }
            }

            System.out.print(max + " ");
        }

        sc.close();
    }
}