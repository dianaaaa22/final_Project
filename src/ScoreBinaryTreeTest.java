import org.junit.Test;
import static org.junit.Assert.*;

public class ScoreBinaryTreeTest {

    @Test
    public void testInsertAndTraversalSize() {
        ScoreBinaryTree tree = new ScoreBinaryTree();

        tree.insert("A", 2);
        tree.insert("B", 5);
        tree.insert("C", 1);

        // Verify the tree contains 3 elements
        assertEquals(3, tree.inOrderTraversal().size());
    }
}
