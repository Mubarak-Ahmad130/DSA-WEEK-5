import java.util.Scanner;

public class Stack {
    int top;
    int maxSize;
    int[] stack;

    // Constructor
    Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    // Push operation
    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into stack.");
        }
    }

    // Pop operation
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Nothing to pop.");
        } else {
            System.out.println(stack[top--] + " popped from stack.");
        }
    }

    // Peek operation
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    // Display stack
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}
