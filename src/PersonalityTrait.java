package src;

import java.util.HashMap;

/**
 * Stores personality scores and provides results.
 */
public class PersonalityTrait {

    private HashMap<String, Integer> scores;
    private HashMap<String, String> descriptions;
    private HashMap<String, String> jobs;
    private HashMap<String, String> hobbies;

    public PersonalityTrait() {
        scores = new HashMap<>();
        descriptions = new HashMap<>();
        jobs = new HashMap<>();
        hobbies = new HashMap<>();

        // Initialize scores
        scores.put("A", 0);
        scores.put("B", 0);
        scores.put("C", 0);

        // Personality descriptions
        descriptions.put("A",
                "The Anchor: Calm, steady, reliable, and level-headed.");
        descriptions.put("B",
                "The Balancer: Flexible, adaptable, and goes with the flow.");
        descriptions.put("C",
                "The Entertainer: Energetic, outgoing, and expressive.");

        // Recommended jobs
        jobs.put("A",
                "Engineer, Therapist, Project Manager");
        jobs.put("B",
                "Consultant, Teacher, Human Resources");
        jobs.put("C",
                "Actor, Marketing Specialist, Event Planner");

        // Recommended hobbies
        hobbies.put("A",
                "Reading, journaling, yoga");
        hobbies.put("B",
                "Traveling, photography, volunteering");
        hobbies.put("C",
                "Dancing, team sports, content creation");
    }

    // Adds points to a personality type
    public void addScore(String type, int value) {
        scores.put(type, scores.get(type) + value);
    }

    // Returns the personality type with the highest score
    public String getTopType() {
        String bestType = null;
        int highestScore = -1;

        for (String type : scores.keySet()) {
            if (scores.get(type) > highestScore) {
                highestScore = scores.get(type);
                bestType = type;
            }
        }
        return bestType;
    }

    public String getDescription(String type) {
        return descriptions.get(type);
    }

    public String getJobs(String type) {
        return jobs.get(type);
    }

    public String getHobbies(String type) {
        return hobbies.get(type);
    }

    public HashMap<String, Integer> getScores() {
        return scores;
    }
}
