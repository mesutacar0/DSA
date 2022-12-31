package datastructures.doublyLinkedList;

public class DoublyLinkedList {
    private int length;
    private Node head;
    private Node tail;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLenth() {
        System.out.println("Length: " + length);
    }

    public void printList() {
        if (length == 0) {
            System.out.println("List is empty!");
        }
        System.out.println("Print List: ");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        length++;
    }

    public Node removeLast() {
        if (length == 0)
            return null;

        Node temp = tail;
        if (length == 1) {
            tail = null;
            head = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0)
            return null;
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length)
            return null;
        Node temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = 1; i < length - index; i++) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public void set(int index, int value) {
        if (true)
            get(index).value = value;
        if (index < 0 || index >= length)
            throw new IndexOutOfBoundsException();
        Node temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
                temp.value = value;
            }
        } else {
            temp = tail;
            for (int i = 1; i < length - index; i++) {
                temp = temp.prev;
                temp.value = value;
            }
        }
    }

    public void insert(int index, int value) {
        if (index < 0 || index > length)
            throw new IndexOutOfBoundsException();
        if (length == 0 || index == 0) {
            prepend(value);
        } else if (index == length) {
            append(value);
        } else {
            Node pre = get(index - 1);
            Node nex = get(index + 1);
            Node newNode = new Node(value);
            pre.next = newNode;
            newNode.prev = pre;
            nex.prev = newNode;
            newNode.next = nex;
            length++;
        }
    }

    public Node remove(int index) {
        if (index < 0 || index >= length)
            throw new IndexOutOfBoundsException();
        if (index == 0)
            return removeFirst();
        if (index == length - 1)
            return removeLast();

        Node temp = get(index);
        Node before = temp.prev;
        Node after = temp.next;

        before.next = after;
        after.prev = before;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;

    }
}
