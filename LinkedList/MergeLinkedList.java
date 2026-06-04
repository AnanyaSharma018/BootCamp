class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeLinkedList {

    static Node merge(Node head1, Node head2) {
        if (head1 == null)
            return head2;

        Node temp = head1;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = head2;

        return head1;
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

        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);

        Node head2 = new Node(40);
        head2.next = new Node(50);
        head2.next.next = new Node(60);

        Node mergedHead = merge(head1, head2);

        System.out.print("Merged List: ");
        display(mergedHead);
    }
}