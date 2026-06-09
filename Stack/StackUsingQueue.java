import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class StackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    static void push(int data) {
        q2.add(data);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        System.out.println(data + " pushed");
    }

    static void pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Popped: " + q1.remove());
    }

    static void peek() {
        if (q1.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Top Element: " + q1.peek());
    }

    static void display() {
        if (q1.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("Stack: ");
        for (int x : q1) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Element: ");
                    value = sc.nextInt();
                    push(value);
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 5);

        sc.close();
    }
}