class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CloneLinkedList {

    static Node cloneList(Node head) {
        if (head == null)
            return null;

        Node newHead = new Node(head.data);
        Node temp1 = head.next;
        Node temp2 = newHead;

        while (temp1 != null) {
            temp2.next = new Node(temp1.data);
            temp2 = temp2.next;
            temp1 = temp1.next;
        }

        return newHead;
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

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("Original List: ");
        display(head);

        Node clonedHead = cloneList(head);

        System.out.print("Cloned List: ");
        display(clonedHead);
    }
}