package src;

import java.util.ArrayList;

/**
 * Stores all questions and answer choices for the personality test.
 */
public class Questions {

    private ArrayList<String> questions;
    private ArrayList<String[]> choices;

    public Questions() {
        questions = new ArrayList<>();
        choices = new ArrayList<>();

        // Add 5 questions
        questions.add("I consider myself a calm person in stressful situations.");
        questions.add("I enjoy spending time in large groups of people.");
        questions.add("I prefer staying indoors rather than going outside.");
        questions.add("I like to plan things rather than be spontaneous.");
        questions.add("I consider myself a creative person.");

        // Same answer choices for all questions
        String[] scale = {
            "Strongly Disagree",
            "Disagree",
            "Neutral",
            "Agree",
            "Strongly Agree"
        };

        // Add choices for each question
        for (int i = 0; i < questions.size(); i++) {
            choices.add(scale);
        }
    }

    // Returns total number of questions
    public int size() {
        return questions.size();
    }

    // Returns question text at index
    public String getQuestionText(int index) {
        return questions.get(index);
    }

    // Returns answer choices for question at index
    public String[] getChoices(int index) {
        return choices.get(index);
    }
}
