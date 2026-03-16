import java.util.Scanner;

public class StackProgram {

    int stack[] = new int[5];
    int top = -1;

    // Push function
    void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    // Pop function
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top] + " popped from stack");
            top--;
        }
    }

    // Display function
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        StackProgram s = new StackProgram();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.pop();

        s.display();
    }
}
