package datastructures.binarySearchTree;

public class BinarySearchTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        } else {
            Node temp = root;
            boolean isNotInserted = true;
            while (isNotInserted) {
                if (newNode.value > temp.value) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        isNotInserted = false;
                    }
                    temp = temp.right;
                } else {
                    if (temp.left == null) {
                        temp.left = newNode;
                        isNotInserted = false;
                    }
                    temp = temp.left;
                }
            }
        }
    }

    public boolean contains(int value) {
        Node temp = root;
        while (temp != null) {
            if (temp.value == value)
                return true;
            else {
                if (temp.value > value) {
                    temp = temp.left;
                } else {
                    temp = temp.right;
                }
            }
        }
        return false;
    }

}
