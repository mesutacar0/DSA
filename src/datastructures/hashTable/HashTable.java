package datastructures.hashTable;

import java.util.ArrayList;

public class HashTable {
    private final int size = 7;
    private Node[] dataMap;

    public HashTable() {
        dataMap = new Node[size];
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ": ");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("   {" + temp.key + "=" + temp.value + "} ");
                temp = temp.next;
            }
        }
    }

    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (asciiValue * 31 + hash) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        int hash = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[hash] == null) {
            dataMap[hash] = newNode;
        } else {
            Node temp = dataMap[hash];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public Node get(String key) {
        int hash = hash(key);
        Node temp = dataMap[hash];
        while (temp != null) {
            if (temp.key == key)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public ArrayList<String> keys() {
        ArrayList<String> allKeys = new ArrayList<>();
        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            while (temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }

}
