package src;

import java.util.HashMap;

/**
 * Stores personality scores AND descriptions.
 * Uses HashMaps (ADT).
 */
public class PersonalityTrait {

    // Stores scores for each personality type
    private HashMap<String, Integer> scores;

    // Stores descriptions for each personality type
    private HashMap<String, String> descriptions;

    /**
     * Initializes scores and descriptions.
     */
    public PersonalityTrait() {
        scores = new HashMap<>();
        descriptions = new HashMap<>();

        // Initialize personality types
        scores.put("A", 0);
        scores.put("B", 0);
        scores.put("C", 0);
        scores.put("D", 0);

        descriptions.put("A", "You are calm, organized, and reliable.");
        descriptions.put("B", "You are social, energetic, and outgoing.");
        descriptions.put("C", "You are creative, expressive, and imaginative.");
        descriptions.put("D", "You are analytical, thoughtful, and reserved.");
    }

    /**
     * Adds points to a personality trait.
     */
    public void addScore(String type, int value) {
        scores.put(type, scores.get(type) + value);
    }

    /**
     * Returns the personality type with the highest score.
     */
    public String getTopType() {
        String bestType = null;
        int maxScore = -1;

        for (String key : scores.keySet()) {
            if (scores.get(key) > maxScore) {
                maxScore = scores.get(key);
                bestType = key;
            }
        }
        return bestType;
    }

    /**
     * Returns description for a personality type.
     */
    public String getDescription(String type) {
        return descriptions.getOrDefault(type, "No description available.");
    }

    /**
     * Returns all personality scores.
     */
    public HashMap<String, Integer> getScores() {
        return scores;
    }
}
