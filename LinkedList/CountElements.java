import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CountElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null, tail = null;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();

            if (data == -1) {
                break; 
            }

            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

            count++;
        }

        System.out.println(count);
    }
}