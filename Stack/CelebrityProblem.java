import java.util.Scanner;
import java.util.Stack;

class CelebrityProblem {

    static int findCelebrity(int[][] M, int n) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();

            if (M[a][b] == 1)
                st.push(b);
            else
                st.push(a);
        }

        int c = st.pop();

        for (int i = 0; i < n; i++) {
            if (i != c) {
                if (M[c][i] == 1 || M[i][c] == 0)
                    return -1;
            }
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] M = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = sc.nextInt();
            }
        }

        int ans = findCelebrity(M, n);

        if (ans == -1)
            System.out.println("No Celebrity");
        else
            System.out.println("Celebrity is Person " + ans);
    }
}