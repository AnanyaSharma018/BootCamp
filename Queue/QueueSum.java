import java.util.Scanner;

public class QueueSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total elements: ");
        int n = sc.nextInt();

        int[] queue = new int[n];
        int rear = -1;
        int sum = 0;

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            queue[++rear] = sc.nextInt(); 
        }

        for (int i = 0; i <= rear; i++) {
            sum += queue[i];
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}