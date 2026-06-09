import java.util.Scanner;
import java.util.Stack;

class DeleteMiddleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        int mid = n / 2;

        Stack<Integer> temp = new Stack<>();

        for (int i = 0; i < mid; i++) {
            temp.push(stack.pop());
        }

      
        stack.pop();

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        System.out.println("Stack after deleting middle element:");
        System.out.println(stack);

        sc.close();
    }
}