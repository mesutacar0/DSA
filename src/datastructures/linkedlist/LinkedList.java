package datastructures.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length = 0;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        System.out.println();
        System.out.println("LinkedList");
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public void removeLast() {
        if (length == 0) {
            System.out.println("List is empty!");
        } else if (length == 1) {
            head = null;
            tail = null;
            length--;
            System.out.println("Last node removed!");
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next == tail) {
                    temp.next = null;
                    tail = temp;
                } else {
                    temp = temp.next;
                }
            }
            length--;
        }
    }

    public void removeFirst() {
        if (length == 0) {
            System.out.println("List is empty!");
        } else if (length == 1) {
            head = null;
            tail = null;
            length--;
            System.out.println("First node removed!");
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
            length--;
        }
    }

    public Node get(int index) {
        if (index + 1 > length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void set(int index, int value) {
        if (index + 1 > length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.value = value;
    }

    public void insert(int index, int value) {
        Node prevNode = get(index - 1);
        Node newNode = new Node(value);
        if (prevNode == null) {
            prepend(value);
        } else if (prevNode.next == null) {
            append(value);
        } else {
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
            ;
        }
        if (length - 1 == index) {
            removeLast();
        }
        Node prevNode = get(index - 1);
        Node temp = prevNode.next;
        prevNode.next = temp.next;
        temp.next = null;
        length--;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after = temp.next;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

}
