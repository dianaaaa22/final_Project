package src;

import java.util.Scanner;

/**
 * Main driver class for the 07Personality Test.
 * Asks 5 questions and determines a personality type.
 */
public class PersonalityTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Questions questions = new Questions();
        PersonalityTrait trait = new PersonalityTrait();

        System.out.println();
        System.out.println("Welcome to the 07Personality Test! :");
        System.out.println("Answer each question with a number from 1 to 5.");
        System.out.println("1 = Strongly Disagree");
        System.out.println("5 = Strongly Agree\n");

        // Ask ALL 5 questions
        for (int i = 0; i < 5; i++) {

            System.out.println("Question " + (i + 1) + ":");
            System.out.println(questions.getQuestionText(i));

            String[] choices = questions.getChoices(i);
            for (int j = 0; j < choices.length; j++) {
                System.out.println((j + 1) + ". " + choices[j]);
            }

            int answer = getValidAnswer(scanner);

            // Scoring logic for 3 personality types
            if (answer >= 4) {
                trait.addScore("A", 1);   // Agree / Strongly Agree
            } else if (answer == 3) {
                trait.addScore("B", 1);   // Neutral
            } else {
                trait.addScore("C", 1);   // Disagree / Strongly Disagree
            }

            System.out.println(); // spacing between questions
        }

        // Display result AFTER all questions
        System.out.println("RESULTS:");

        String topType = trait.getTopType();

        System.out.println("Your personality type: ");
        System.out.println(trait.getDescription(topType));

        System.out.println("\nRecommended Careers:");
        System.out.println(trait.getJobs(topType));

        System.out.println("\nRecommended Hobbies:");
        System.out.println(trait.getHobbies(topType));


        scanner.close();
    }

    /**
     * Safely gets a valid number between 1 and 5 from the user.
     */
    private static int getValidAnswer(Scanner scanner) {
        int answer = 0;

        while (answer < 1 || answer > 5) {
            System.out.print("Enter your answer (1-5): ");
            String input = scanner.nextLine();

            try {
                answer = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        return answer;
    }
}
