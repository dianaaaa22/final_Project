package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import src.PersonalityTrait;

/**
 * Beginner tests for PersonalityTrait
 */
public class PersonalityTraitTest {

    // Test that adding a score actually changes the value
    @Test
    public void addScoreWorks() {
        PersonalityTrait trait = new PersonalityTrait();
        trait.addScore("A", 1);
        assertEquals(1, trait.getScores().get("A"));
    }

    // Test that the highest score is returned correctly
    @Test
    public void topTypeIsCorrect() {
        PersonalityTrait trait = new PersonalityTrait();
        trait.addScore("B", 3);
        trait.addScore("A", 1);
        assertEquals("B", trait.getTopType());
    }
}
