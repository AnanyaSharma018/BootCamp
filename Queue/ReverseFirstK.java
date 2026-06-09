import java.util.*;
import java.util.Queue;
import java.util.Stack;;

class ReverseFirstK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter queue elements:");
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

       
        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }

    
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        for (int i = 0; i < n - k; i++) {
            q.add(q.remove());
        }

        System.out.println("Queue after reversing first " + k + " elements:");
        System.out.println(q);

        sc.close();
    }
}