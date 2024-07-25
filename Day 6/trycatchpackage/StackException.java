package trycatchpackage;

class StackOveflowException extends Exception {
    public String toString() {
        return "Stack Overflow";
    }
}

class StackUnderflowException extends Exception {
    public String toString() {
        return "Stack Underflow";
    }
}

class Stack {
    private int size;
    private int top = -1;
    private int Arr[];

    public Stack(int size) {
        this.size = size;
        Arr = new int[size];
    }

    public void push(int p) throws StackOveflowException {
        if (top == size - 1) {
            throw new StackOveflowException();
        } else {
            top++;
            Arr[top] = p;
        }
    }

    public void pop() throws StackUnderflowException {
        // int x = -1;
        if (top == -1) {
            throw new StackUnderflowException();
        } else {
            // x = Arr[top];
            top--;
            // return x;
        }
    }

    public void showStack() {
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
    }
}

public class StackException {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        try {
            // s.push(5);

            // s.pop();
            // s.showStack();
            // s.pop();
            s.showStack();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
