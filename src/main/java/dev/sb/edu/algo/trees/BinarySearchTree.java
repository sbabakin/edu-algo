package dev.sb.edu.algo.trees;

public class BinarySearchTree {

    private final Node root;

    public BinarySearchTree(int... values) {
        assert values != null && values.length > 0 : "invalid conditions";

        root = new Node(values[0]);
        for (int i = 1; i <= values.length - 1; i++) {
            root.insert(new Node(values[i]));
        }
    }

    public void insert(int value) {
        root.insert(new Node(value));
    }

    public boolean contains(int value) {
        return root.contains(value);
    }

    public void printInOrder(){
        root.printInOrder();
    }

    public void printPreOrder() {
        root.printPreOrder();
    }
    public void printPostOrder(){
        root.printPostOrder();
    }

    public static class Node {

        private Node left;
        private Node right;

        private final int value;

        public Node(int value) {
            this.value = value;
        }

        public void insert(Node node) {
            if (node.value <= this.value) {
                if (left == null) {
                    left = node;
                } else {
                    left.insert(node);
                }
            } else {
                if (right == null) {
                    right = node;
                } else {
                    right.insert(node);
                }
            }
        }

        public boolean contains(int value) {
            if (value == this.value) {
                return true;
            }

            // these conditions may be simplified,
            // just for verbosity
            if (value < this.value) {
                if (left == null) {
                    return false;
                }
                return left.contains(value);
            } else {
                if (right == null) {
                    return false;
                }
                return right.contains(value);
            }
        }

        public void printInOrder() {
            if (left != null){
                left.printInOrder();
            }

            System.out.print(" >> " + this.value);

            if (right != null){
                right.printInOrder();
            }
        }

        public void printPreOrder() {
            System.out.print(" >> " + this.value);
            if (left != null){
                left.printInOrder();
            }
            if (right != null){
                right.printInOrder();
            }
        }

        public void printPostOrder() {
            if (left != null){
                left.printInOrder();
            }
            if (right != null){
                right.printInOrder();
            }
            System.out.print(" >> " + this.value);
        }
    }
}
