import java.util.Scanner;

class TwoStacks {
    int[] arr;
    int top1, top2;
    int size;

    TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }

    void push1(int x) {
        if (top1 < top2 - 1) {
            arr[++top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    void push2(int x) {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    void pop1() {
        if (top1 >= 0) {
            System.out.println("Popped from Stack 1: " + arr[top1--]);
        } else {
            System.out.println("Stack 1 Underflow");
        }
    }

    void pop2() {
        if (top2 < size) {
            System.out.println("Popped from Stack 2: " + arr[top2++]);
        } else {
            System.out.println("Stack 2 Underflow");
        }
    }

    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(10);

        ts.push1(10);
        ts.push1(20);
        ts.push1(30);

        ts.push2(100);
        ts.push2(200);
        ts.push2(300);

        ts.pop1();
        ts.pop2();
    }
}