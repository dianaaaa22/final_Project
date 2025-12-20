import org.junit.Test;
import static org.junit.Assert.*;


public class QuestionsTest {

    @Test
    void questionCountIsGreaterThanZero() {
        Questions q = new Questions();
        assertTrue(q.size() > 0);
    }

    @Test
    void firstQuestionTextIsNotNull() {
        Questions q = new Questions();
        assertNotNull(q.getQuestionText(0));
    }
}
