import java.util.*;
import java.util.Stack;

class stockspan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] price = new int[n];
        int[] span = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }

            if (st.isEmpty())
                span[i] = i + 1;
            else
                span[i] = i - st.peek();

            st.push(i);
        }

        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}