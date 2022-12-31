package datastructures.binarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(9);
        bst.insert(8);
        bst.insert(100);
        bst.insert(5);
        bst.insert(1);
        bst.insert(18);

        System.out.println(bst.contains(0));
        System.out.println(bst.contains(100));
        System.out.println(bst.contains(9));
        System.out.println(bst.contains(43));
        System.out.println(bst.contains(18));
    }
}
