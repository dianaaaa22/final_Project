package test;

import src.PersonalityTrait;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonalityTraitTest {

    @Test
    public void addScoreWorks() {
        PersonalityTrait trait = new PersonalityTrait();
        trait.addScore("A", 1);                 // ✅ correct Java
        assertEquals(1, trait.getScores().get("A"));
    }

    @Test
    public void topTypeWorks() {
        PersonalityTrait trait = new PersonalityTrait();
        trait.addScore("B", 3);
        trait.addScore("A", 1);
        assertEquals("B", trait.getTopType());
    }
}
