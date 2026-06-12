import java.util.Scanner;
import java.util.Stack;

class RectangleInHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int i = 0;

        while (i < n) {
            if (st.isEmpty() || h[st.peek()] <= h[i]) {
                st.push(i++);
            } else {
                int top = st.pop();
                int area;

                if (st.isEmpty())
                    area = h[top] * i;
                else
                    area = h[top] * (i - st.peek() - 1);

                maxArea = Math.max(maxArea, area);
            }
        }

        while (!st.isEmpty()) {
            int top = st.pop();
            int area;

            if (st.isEmpty())
                area = h[top] * i;
            else
                area = h[top] * (i - st.peek() - 1);

            maxArea = Math.max(maxArea, area);
        }

        System.out.println("Largest Rectangle Area = " + maxArea);
    }
}