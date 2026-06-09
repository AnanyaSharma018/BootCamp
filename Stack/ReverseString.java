import java.util.Scanner;
import java.util.Stack;

class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        
        System.out.print("Reversed String: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        sc.close();
    }
}