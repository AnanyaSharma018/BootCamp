class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveKthNode {

    static Node removeKthNode(Node head, int k) {

       
        if (head == null)
            return null;

        
        if (k == 1)
            return head.next;

        Node temp = head;

        
        for (int i = 1; temp != null && i < k - 1; i++) {
            temp = temp.next;
        }

       
        if (temp == null || temp.next == null)
            return head;

      
        temp.next = temp.next.next;

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

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Original List:");
        printList(head);

        int k = 3;

        head = removeKthNode(head, k);

        System.out.println("After Removing " + k + "rd Node:");
        printList(head);
    }
}