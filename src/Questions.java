package src;

import java.util.ArrayList;

/**
 * Manages quiz questions using ArrayList.
 */
public class Questions {

    /**
     * Inner Question class (no separate file needed)
     */
    private static class Question {
        String text;
        String[] choices;
        String traitKey;

        Question(String text, String[] choices, String traitKey) {
            this.text = text;
            this.choices = choices;
            this.traitKey = traitKey;
        }
    }

    private ArrayList<Question> questions;

    public Questions() {
        questions = new ArrayList<>();

        String[] scale = {
            "Strongly Disagree",
            "Disagree",
            "Neutral",
            "Agree",
            "Strongly Agree"
        };

        questions.add(new Question(
            "I consider myself a calm person in stressful situations",
            scale,
            "A"
        ));

        questions.add(new Question(
            "I enjoy spending time in large groups of people",
            scale,
            "B"
        ));
    }

    public int size() {
        return questions.size();
    }

    public String getQuestionText(int index) {
        return questions.get(index).text;
    }

    public String[] getChoices(int index) {
        return questions.get(index).choices;
    }

    public String getTraitKey(int index) {
        return questions.get(index).traitKey;
    }
}
