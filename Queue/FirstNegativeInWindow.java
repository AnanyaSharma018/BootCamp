import java.util.*;

class FirstNegativeInWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            if (arr[i] < 0)
                q.add(i);

            if (i >= k - 1) {

                while (!q.isEmpty() && q.peek() < i - k + 1)
                    q.poll();

                if (!q.isEmpty())
                    System.out.print(arr[q.peek()] + " ");
                else
                    System.out.print("0 ");
            }
        }
    }
}