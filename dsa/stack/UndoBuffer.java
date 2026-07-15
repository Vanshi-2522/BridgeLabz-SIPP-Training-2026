package dsa.stack;
class UndoBuffer {
    private String[] data;
    private int top;

    public UndoBuffer(int capacity) {
        data = new String[capacity];
        top = -1;
    }

    public boolean push(String edit) {
        if (top == data.length - 1) {
            System.out.println("Undo buffer full.");
            return false;
        }

        data[++top] = edit;
        return true;
    }

    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("Nothing to undo");
        }

        return data[top--];
    }

    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Buffer empty");
        }

        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {

        UndoBuffer stack = new UndoBuffer(3);

        stack.push("Type A");
        stack.push("Type B");
        stack.push("Type C");

        stack.push("Type D");

        System.out.println(stack.peek());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
