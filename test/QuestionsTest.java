package test;

import src.Questions;

/**
 * Simple test class for Questions.
 */
public class QuestionsTest {

    public static void main(String[] args) {

        Questions q = new Questions();

        if (q.size() > 0) {
            System.out.println("Question count test PASSED");
        } else {
            System.out.println("Question count test FAILED");
        }

        if (q.getQuestionText(0) != null) {
            System.out.println("Question text test PASSED");
        } else {
            System.out.println("Question text test FAILED");
        }
    }
}
