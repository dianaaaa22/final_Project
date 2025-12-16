package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import src.ScoreBinaryTree;

import java.util.ArrayList;

/**
 * Beginner tests for Binary Tree
 */
public class ScoreBinaryTreeTest {

    // Test that tree stores values in order
    @Test
    public void treeOrdersScores() {
        ScoreBinaryTree tree = new ScoreBinaryTree();

        tree.insert("A", 2);
        tree.insert("B", 5);
        tree.insert("C", 1);

        ArrayList<String> results = tree.inOrderTraversal();

        assertEquals(3, results.size());
        assertTrue(results.get(0).contains("C"));
    }
}

