import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueSumLinkedList {
    static Node front = null;
    static Node rear = null;

    static void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    static int findSum() {
        int sum = 0;
        Node temp = front;

        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            enqueue(sc.nextInt());
        }

        System.out.println("Sum = " + findSum());

        sc.close();
    }
}