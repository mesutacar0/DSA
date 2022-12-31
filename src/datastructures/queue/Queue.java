package datastructures.queue;

public class Queue {
    Node first;
    Node last;
    int size = 0;

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        size++;
    }

    public void getFirst() {
        System.out.println(first.value);
    }

    public void getLast() {
        System.out.println(last.value);
    }

    public void getSize() {
        System.out.println(size);
    }

    public void printQueue() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            Node temp = first;
            System.out.println("Print Queue: ");
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (size == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public Node dequeue() {
        if (size == 0)
            return null;
        Node temp = first;
        if (size == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        size--;
        return temp;
    }

}
