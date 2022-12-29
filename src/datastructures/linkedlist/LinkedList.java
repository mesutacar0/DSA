package datastructures.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length = 0;

    public LinkedList(int value){
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

    public void append(int value){         
            Node newNode = new Node(value);
            if (length == 0){
                head = newNode;
                tail = newNode;
            }else{ 
                tail.next = newNode;
                tail = newNode;
            } 
            length++;
    }

    public void removeLast(){
        if (length == 0){
            System.out.println("List is empty!");
        }else if (length == 1){
            head = null;
            tail = null;
            length--;
            System.out.println("Last node removed!");
        }else{
            Node temp = head;
            while (temp.next != null) {
                if (temp.next == tail){
                    temp.next = null;
                    tail = temp;
                }else{
                    temp = temp.next;
                }
            }    
            length--;
        }
    }

}
