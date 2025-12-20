import java.util.ArrayList;

public class Questions {

    private final ArrayList<String> questions;
    private final ArrayList<String[]> choices;
    private final ArrayList<Character> type;
    private final ArrayList<Integer> weight;
   

    public Questions() {
        questions = new ArrayList<>();
        choices = new ArrayList<>();
        type = new ArrayList<>();
        weight = new ArrayList<>();

        addQuestion(
            "When I am under a lot of pressure or stress, I am usually able to stay calm and think clearly.",
            new String[]{"Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree"},
            'A',
            3
        );

        addQuestion(
            "In social situations, I enjoy meeting new people and feel energized when surrounded by large groups.",
            new String[]{"Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree"},
            'C',
            3
        );

        addQuestion(
            "When plans suddenly change, I can adjust quickly without feeling frustrated or anxious.",
            new String[]{"Never", "Rarely", "Sometimes", "Often", "Always"},
            'B',
            2
        );

        addQuestion(
            "I prefer to carefully plan my schedule and tasks rather than leaving things open or unstructured.",
            new String[]{"Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree"},
            'A',
            3
        );

        addQuestion(
            "I often express myself creatively through activities like art, music, writing, or design.",
            new String[]{"Not at all", "A little", "Somewhat", "Mostly", "Very much"},
            'C',
            2
        );

        addQuestion(
            "When working on a group project, I naturally take on a steady and dependable role.",
            new String[]{"Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree"},
            'A',
            2
        );

        addQuestion(
            "I am comfortable going along with other people’s ideas even if I do not strongly prefer them.",
            new String[]{"Never", "Rarely", "Sometimes", "Often", "Always"},
            'B',
            2
        );

        addQuestion(
            "I enjoy entertaining others and making people laugh or feel included in conversations.",
            new String[]{"Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree"},
            'C',
            3
        );

        addQuestion(
            "When faced with conflict, I try to keep things balanced and avoid taking extreme sides.",
            new String[]{"Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree"},
            'B',
            3
        );

        addQuestion(
            "I feel most comfortable when I know what is expected of me ahead of time.",
            new String[]{"Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree"},
            'A',
            2
        );

        addQuestion(
            "I enjoy trying new experiences even if they push me outside of my comfort zone.",
            new String[]{"Never", "Rarely", "Sometimes", "Often", "Always"},
            'C',
            2
        );

        addQuestion(
            "I tend to stay flexible and open-minded when solving problems or making decisions.",
            new String[]{"Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree"},
            'B',
            2
        );

        addQuestion(
            "People often describe me as reliable and emotionally steady.",
            new String[]{"Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree"},
            'A',
            3
        );

        addQuestion(
            "I like expressing my personality openly rather than keeping my thoughts and feelings private.",
            new String[]{"Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree"},
            'C',
            2
        );

        addQuestion(
            "I try to keep peace between people and help situations feel more balanced and fair.",
            new String[]{"Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree"},
            'B',
            3
        );
    }

    private void addQuestion(String question, String[] options, char personalityType, int questionWeight) {
        questions.add(question);
        choices.add(options);
        type.add(personalityType);
        weight.add(questionWeight);
    }

    public int size() {
        return questions.size();
    }

    public String getQuestionText(int index) {
        return questions.get(index);
    }

    public String[] getChoices(int index) {
        return choices.get(index);
    }

    public char getType(int index) {
        return type.get(index);
    }

    public int getWeight(int index) {
        return weight.get(index);
    }
}
