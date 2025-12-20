import org.junit.Test;
import static org.junit.Assert.*;

public class PersonalityTraitTest {

    @Test
    public void testAddScore() {
        PersonalityTrait trait = new PersonalityTrait();

        trait.addScore("A", 1);

        assertEquals(1, trait.getScores().get("A"));
    }

    @Test
    public void testGetTopType() {
        PersonalityTrait trait = new PersonalityTrait();

        trait.addScore("A", 1);
        trait.addScore("B", 3);

        assertEquals("B", trait.getTopType());
    }
}

