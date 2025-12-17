import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
