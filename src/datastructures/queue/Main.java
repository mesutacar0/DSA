package datastructures.queue;

public class Main {
    public static void main(String[] args) {

        Queue qu = new Queue(8);

        qu.printQueue();

        System.out.println("---------enqueue-------");
        qu.enqueue(43);
        qu.enqueue(66);
        qu.printQueue();

        System.out.println("---------dequeue-------");
        System.out.println(qu.dequeue().value);
        System.out.println(qu.dequeue().value);
        System.out.println(qu.dequeue().value);
        System.out.println(qu.dequeue().value);
    }
}
