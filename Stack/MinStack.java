import java.util.Stack;

public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    void push(int x) {
        stack.push(x);

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }

        int removed = stack.pop();

        if (removed == minStack.peek()) {
            minStack.pop();
        }

        System.out.println("Popped: " + removed);
    }

    void top() {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Top Element: " + stack.peek());
    }

    void getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Minimum Element: " + minStack.peek());
    }

    public static void main(String[] args) {

        MinStack s = new MinStack();

        s.push(5);
        s.push(3);
        s.push(7);
        s.push(2);

        s.getMin();
        s.pop();
        s.getMin();
        s.top();
    }
}