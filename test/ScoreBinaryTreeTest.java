package test;

import src.ScoreBinaryTree;

/**
 * Simple test class for ScoreBinaryTree.
 */
public class ScoreBinaryTreeTest {

    public static void main(String[] args) {

        ScoreBinaryTree tree = new ScoreBinaryTree();

        tree.insert("A", 2);
        tree.insert("B", 5);
        tree.insert("C", 1);

        if (tree.inOrderTraversal().size() == 3) {
            System.out.println("Tree insert test PASSED");
        } else {
            System.out.println("Tree insert test FAILED");
        }
    }
}
