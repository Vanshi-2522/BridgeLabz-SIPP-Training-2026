package dsa.stack;
class CallStack {

    static class Node {
        String function;
        Node next;

        Node(String function) {
            this.function = function;
        }
    }

    Node top;

    public void push(String function) {

        Node newNode = new Node(function);

        newNode.next = top;

        top = newNode;
    }

    public String pop() {

        if (isEmpty())
            throw new RuntimeException("Empty Stack");

        String value = top.function;

        top = top.next;

        return value;
    }

    public String peek() {

        if (isEmpty())
            throw new RuntimeException("Empty Stack");

        return top.function;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {

        CallStack stack = new CallStack();

        stack.push("main()");
        stack.push("login()");
        stack.push("validate()");

        System.out.println(stack.peek());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

}