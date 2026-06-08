import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteFromSpecificPosition {

    static Node deleteAtPosition(Node head, int pos) {

        if (head == null)
            return null;

       
        if (pos == 1) {

          
            if (head.next == head)
                return null;

            Node last = head;
            while (last.next != head) {
                last = last.next;
            }

            last.next = head.next;
            head = head.next;
            return head;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;

            if (temp == head) {
                System.out.println("Invalid Position");
                return head;
            }
        }

        if (temp.next == head) {
            System.out.println("Invalid Position");
            return head;
        }

        temp.next = temp.next.next;
        return head;
    }

    static void display(Node head) {
        if (head == null)
            return;

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null, tail = null;

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();

            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
                tail.next = head;
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
        }

        int pos = sc.nextInt();

        head = deleteAtPosition(head, pos);

        display(head);
    }
}