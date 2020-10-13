package dev.sb.edu.algo.trees;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class BinarySearchTreeTest {

    @Test
    void insert() {
        BinarySearchTree tree = new BinarySearchTree(5, 7, 9);
        tree.insert(4);
    }

    @Test
    void contains() {
        BinarySearchTree tree = new BinarySearchTree(5, 7, 9, 1, 2);
        assertTrue(tree.contains(5));
        assertTrue(tree.contains(7));
        assertTrue(tree.contains(9));
        assertTrue(tree.contains(1));
        assertTrue(tree.contains(2));
        assertFalse(tree.contains(8));
    }

    @Test
    void printInOrder() {
        BinarySearchTree tree = new BinarySearchTree(5, 7, 9, 1, 2);
        tree.printInOrder();
    }

    @Test
    void printPreOrder() {
        BinarySearchTree tree = new BinarySearchTree(5, 7, 9, 1, 2);
        tree.printPreOrder();
    }

    @Test
    void printPostOrder() {
        BinarySearchTree tree = new BinarySearchTree(5, 7, 9, 1, 2);
        tree.printPostOrder();
    }
}