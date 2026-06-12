import java.util.Scanner;
import java.util.Stack;

class NStack {
    int[] arr, top, next;
    int free;

    NStack(int n, int s) {
        arr = new int[s];
        top = new int[n];
        next = new int[s];

        for (int i = 0; i < n; i++)
            top[i] = -1;

        for (int i = 0; i < s - 1; i++)
            next[i] = i + 1;

        next[s - 1] = -1;
        free = 0;
    }

    void push(int data, int sn) {
        if (free == -1) {
            System.out.println("Stack Overflow");
            return;
        }

        int i = free;
        free = next[i];

        next[i] = top[sn];
        top[sn] = i;

        arr[i] = data;
    }

    int pop(int sn) {
        if (top[sn] == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int i = top[sn];
        top[sn] = next[i];

        next[i] = free;
        free = i;

        return arr[i];
    }
}

class NStackDemo {
    public static void main(String[] args) {
        NStack ns = new NStack(3, 10);

        ns.push(10, 0);
        ns.push(20, 0);

        ns.push(30, 1);
        ns.push(40, 1);

        System.out.println(ns.pop(0));
        System.out.println(ns.pop(1));
    }
}