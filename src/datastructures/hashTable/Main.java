package datastructures.hashTable;

public class Main {
    public static void main(String args[]) {
        HashTable ht = new HashTable();
        ht.printTable();

        System.out.println("--------------set-------");
        ht.set("asdf", 13);
        ht.set("mesut", 507);
        ht.set("mesut", 509);
        ht.set("mesut", 523);
        ht.set("mesut", 523);
        ht.set("mesut", 523);
        ht.set("set", 32);
        ht.printTable();

        System.out.println("--------------get-------");
        System.out.println(ht.get("mesut").value);
        System.out.println(ht.get("ali"));
        System.out.println(ht.get("set").value);

        System.out.println("--------------keys-------");
        System.out.println(ht.keys());
    }
}
