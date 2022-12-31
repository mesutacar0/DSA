package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("----------append-----------");
        myLinkedList.append(17);
        myLinkedList.append(56);
        myLinkedList.append(431);
        myLinkedList.append(44);
        myLinkedList.printList();

        System.out.println("----------removeFirst-----------");
        myLinkedList.removeFirst();
        myLinkedList.printList();

        System.out.println("----------get-----------");
        System.out.println("get0: " + myLinkedList.get(0).value);
        System.out.println("get1: " + myLinkedList.get(1).value);

        System.out.println("----------set-----------");
        myLinkedList.set(0, 99);
        myLinkedList.printList();

        System.out.println("----------reverse-----------");
        myLinkedList.printList();
        myLinkedList.reverse();
        myLinkedList.printList();
    }
}
