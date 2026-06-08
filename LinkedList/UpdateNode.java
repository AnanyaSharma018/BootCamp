import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class UpdateNode {

    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    static void updateNode(Node head, int pos, int newData) {
        Node temp = head;
        int count = 1;

        while (temp != null && count < pos) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Position out of range!");
            return;
        }

        temp.data = newData;
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter node values:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = insert(head, data);
        }

        System.out.print("Enter position to update: ");
        int pos = sc.nextInt();

        System.out.print("Enter new value: ");
        int newData = sc.nextInt();

        updateNode(head, pos, newData);

        System.out.println("Updated Linked List:");
        display(head);

        sc.close();
    }
}