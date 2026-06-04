class Node {
    int data;
    Node next;
    Node child;

    Node(int data) {
        this.data = data;
        next = null;
        child = null;
    }
}

public class FlattenLinkedList {

    static Node flatten(Node head) {
        if (head == null)
            return null;

        Node curr = head;

        while (curr != null) {

            if (curr.child != null) {

                Node temp = curr.child;

                while (temp.next != null) {
                    temp = temp.next;
                }

                temp.next = curr.next;
                curr.next = curr.child;
                curr.child = null;
            }

            curr = curr.next;
        }

        return head;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        head.next.child = new Node(7);
        head.next.child.next = new Node(8);

        head = flatten(head);

        System.out.print("Flattened List: ");
        printList(head);
    }
}