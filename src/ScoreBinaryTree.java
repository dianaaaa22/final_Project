
import java.util.ArrayList;

/**
 * Binary Search Tree used to rank personality types by score.
 * Higher scores go to the right.
 */
public class ScoreBinaryTree {

    /**
     * Inner Node class (no separate file needed)
     */
    private static class Node {
        String type;
        int score;
        Node left;
        Node right;

        Node(String type, int score) {
            this.type = type;
            this.score = score;
            this.score = score;
            left = null;
            right = null;
        }
    }

    private Node root;

    /**
     * Inserts a personality type and score into the tree.
     */
    public void insert(String type, int score) {
        root = insertRecursive(root, type, score);
    }

    private Node insertRecursive(Node current, String type, int score) {
        if (current == null) {
            return new Node(type, score);
        }

        if (score < current.score) {
            current.left = insertRecursive(current.left, type, score);
        } else {
            current.right = insertRecursive(current.right, type, score);
        }

        return current;
    }

    /**
     * Returns personality types ranked from lowest to highest score.
     */
    public ArrayList<String> inOrderTraversal() {
        ArrayList<String> result = new ArrayList<>();
        inOrderRecursive(root, result);
        return result;
    }

    private void inOrderRecursive(Node node, ArrayList<String> list) {
        if (node != null) {
            inOrderRecursive(node.left, list);
            list.add(node.type + " (" + node.score + ")");
            inOrderRecursive(node.right, list);
        }
    }
}

