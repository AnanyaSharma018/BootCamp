class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {

    static Node convertToCircular(Node head) {
        if (head == null)
            return null;

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = head; // Make last node point to head

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

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = convertToCircular(head);

        System.out.println("Circular Linked List:");
        display(head);
    }
}