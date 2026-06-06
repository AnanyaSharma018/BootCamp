import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectLoop {
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

      
        head.next.next.next.next = head.next;

        Node slow = head;
        Node fast = head;

        boolean loopFound = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                loopFound = true;
                break;
            }
        }

        if (loopFound) {
            System.out.println("Loop Detected");
        } else {
            System.out.println("No Loop Found");
        }
    }
}