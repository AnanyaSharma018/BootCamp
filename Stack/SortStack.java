import java.util.Scanner;
import java.util.Stack;

class SortStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            s1.push(sc.nextInt());
        }

        while (!s1.isEmpty()) {
            int temp = s1.pop();

            while (!s2.isEmpty() && s2.peek() > temp) {
                s1.push(s2.pop());
            }

            s2.push(temp);
        }

        System.out.println("Sorted Stack:");

        while (!s2.isEmpty()) {
            System.out.print(s2.pop() + " ");
        }

        sc.close();
    }
}