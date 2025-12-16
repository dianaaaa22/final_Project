package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import src.Questions;

/**
 * Beginner tests for Questions
 */
public class QuestionsTest {

    // Test that questions exist
    @Test
    public void questionsExist() {
        Questions q = new Questions();
        assertTrue(q.size() > 0);
    }

    // Test that the first question has text
    @Test
    public void questionTextExists() {
        Questions q = new Questions();
        assertNotNull(q.getQuestionText(0));
    }
}

