package src;

/**
 * Simple test class for PersonalityTrait.
 * Run this file to see test results.
 */
public class PersonalityTraitTest {

    public static void main(String[] args) {

        PersonalityTrait trait = new PersonalityTrait();

        // Test addScore
        trait.addScore("A", 1);
        if (trait.getScores().get("A") == 1) {
            System.out.println("addScore test PASSED");
        } else {
            System.out.println("addScore test FAILED");
        }

        // Test getTopType
        trait.addScore("B", 3);
        if ("B".equals(trait.getTopType())) {
            System.out.println("getTopType test PASSED");
        } else {
            System.out.println("getTopType test FAILED");
        }
    }
}
