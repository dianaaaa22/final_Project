import java.util.Scanner;

public class PersonalityTest {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            Questions questions = new Questions();
            PersonalityTrait trait = new PersonalityTrait();

            System.out.println();
            System.out.println("Welcome to the Personality Test!");
            System.out.println("Answer each question with a number from 1 to 5.");
            System.out.println("1 = Strongly Disagree");
            System.out.println("5 = Strongly Agree\n");

            for (int i = 0; i < questions.size(); i++) {

                System.out.println("Question " + (i + 1) + ":");
                System.out.println(questions.getQuestionText(i));

                String[] choices = questions.getChoices(i);
                for (int j = 0; j < choices.length; j++) {
                    System.out.println((j + 1) + ". " + choices[j]);
                }

                int answer = getValidAnswer(scanner);

                // Get personality type & weight for this question
                char type = questions.getType(i);
                int weight = questions.getWeight(i);

                // Stronger agreement = more points
                int points = answer * weight;

                trait.addScore(String.valueOf(type), points);

                System.out.println();
            }

            // Display results
            System.out.println("RESULTS:");
            String topType = trait.getTopType();

            System.out.println("\nYour personality type:");
            System.out.println(trait.getDescription(topType));

            System.out.println("\nRecommended Careers:");
            System.out.println(trait.getJobs(topType));

            System.out.println("\nRecommended Hobbies:");
            System.out.println(trait.getHobbies(topType));
        }
    }

    private static int getValidAnswer(Scanner scanner) {
        int answer = 0;

        while (answer < 1 || answer > 5) {
            System.out.print("Enter your answer (1–5): ");
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
