import java.util.Scanner;

class Stack {
    int[] arr;
    int top;
    int size;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // Push
    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = data;
        System.out.println(data + " pushed");
    }

    // Pop
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println(arr[top--] + " popped");
    }

    // Display
    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("Stack Elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class StackArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int n = sc.nextInt();

        Stack s = new Stack(n);

        while (true) {
            System.out.println("\n1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    int data = sc.nextInt();
                    s.push(data);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.display();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}