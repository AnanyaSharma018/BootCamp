import java.util.Scanner;

public class ReverseStringInStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] stack = new char[str.length()];
        int top = -1;

        
        for (int i = 0; i < str.length(); i++) {
            stack[++top] = str.charAt(i);
        }

        System.out.print("Reversed String: ");

      
        while (top != -1) {
            System.out.print(stack[top--]);
        }

        sc.close();
    }
}