package dev.sb.edu.algo.trees;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class SimpleBinaryTreeTest {

    @Test
    void insert() {
        SimpleBinaryTree tree = new SimpleBinaryTree(5, 7, 9);
        tree.insert(4);
    }

    @Test
    void contains() {
        SimpleBinaryTree tree = new SimpleBinaryTree(5, 7, 9, 1, 2);
        assertTrue(tree.contains(5));
        assertTrue(tree.contains(7));
        assertTrue(tree.contains(9));
        assertTrue(tree.contains(1));
        assertTrue(tree.contains(2));
        assertFalse(tree.contains(8));
    }

    @Test
    void printInOrder() {
        SimpleBinaryTree tree = new SimpleBinaryTree(5, 7, 9, 1, 2);
        tree.printInOrder();
    }

    @Test
    void printPreOrder() {
        SimpleBinaryTree tree = new SimpleBinaryTree(5, 7, 9, 1, 2);
        tree.printPreOrder();
    }

    @Test
    void printPostOrder() {
        SimpleBinaryTree tree = new SimpleBinaryTree(5, 7, 9, 1, 2);
        tree.printPostOrder();
    }
}