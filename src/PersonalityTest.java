package src;

import java.util.Scanner;

public class PersonalityTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Questions questions = new Questions();
        PersonalityTrait traits = new PersonalityTrait();
        ScoreBinaryTree tree = new ScoreBinaryTree();

        System.out.println("Welcome to the 07Personality Test!\n");

        for (int i = 0; i < questions.size(); i++) {

            System.out.println(questions.getQuestionText(i));

            String[] choices = questions.getChoices(i);
            for (int j = 0; j < choices.length; j++) {
                System.out.println((j + 1) + ". " + choices[j]);
            }

            int answer = scanner.nextInt();
            traits.addScore(questions.getTraitKey(i), answer);
            System.out.println();
        }

        // Insert scores into Binary Tree
        for (String key : traits.getScores().keySet()) {
            tree.insert(key, traits.getScores().get(key));
        }

        System.out.println("Personality ranking:");
        for (String s : tree.inOrderTraversal()) {
            System.out.println(s);
        }

        scanner.close();
    }
}
