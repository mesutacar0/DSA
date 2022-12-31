package datastructures.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(16);

        dll.getHead();
        dll.getTail();
        dll.getLenth();

        dll.printList();

        System.out.println("---------append-------");
        dll.append(13);
        dll.printList();
        dll.append(12);
        dll.printList();

        System.out.println("---------removeLast-------");
        dll.removeLast();
        dll.printList();
        dll.removeLast();
        dll.printList();

        System.out.println("---------prepend-------");
        dll.prepend(44);
        dll.printList();
        dll.prepend(55);
        dll.printList();

        System.out.println("---------removeFirst-------");
        System.out.println(dll.removeFirst().value);

        System.out.println("---------get-------");
        System.out.println(dll.get(0).value);
        System.out.println(dll.get(1).value);

        System.out.println("---------set-------");
        dll.set(0, 11);
        dll.printList();
        dll.set(1, 22);
        dll.printList();

        System.out.println("---------insert-------");
        dll.insert(0, 0);
        dll.printList();
        dll.insert(3, 33);
        dll.printList();

        System.out.println("---------remove-------");
        dll.remove(0);
        dll.printList();
        dll.remove(1);
        dll.printList();
        dll.remove(1);
        dll.printList();

    }
}
