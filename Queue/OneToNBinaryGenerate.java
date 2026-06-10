import java.util.*;

public class OneToNBinaryGenerate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        Queue<String> q = new LinkedList<>();

        q.add("1");

        for (int i = 1; i <= n; i++) {
            String s = q.remove();

            System.out.print(s + " ");

            q.add(s + "0");
            q.add(s + "1");
        }

        sc.close();
    }
}