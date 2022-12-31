package datastructures.stack;

public class Stack {
    Node top;
    int height = 0;

    public Stack(int value) {
        top = new Node(value);
        height++;
    }

    public void getTop() {
        System.out.println(top.value);
    }

    public void getHeight() {
        System.out.println(height);
    }

    public void printStack() {
        Node temp = top;
        System.out.println("Print Stack: ");
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0)
            top = newNode;
        else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop() {
        if (height == 0)
            return null;
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }
}
