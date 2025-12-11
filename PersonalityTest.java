import java.util.Scanner;

public class PersonalityTest {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Questions q =new Questions();
        PersonalityTrait trait = new PersonalityTrait();
        PersonalityTypes types = new PersonalityTypes();

        System.out.println("Welcome to the 07Personality Test!");

        for (int i = 0; i < q.size(); i++) {

            System.out.println(q.getQuestion(i));
            String[] choices = q.getChoices(i);

            for(int j=0; j < choices.length; j++) {
                System.out.println((j + 1) + ". " + choices[j]);
            }
        }


    }

}
