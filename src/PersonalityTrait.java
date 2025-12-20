
import java.util.HashMap;

public class PersonalityTrait {

    private final HashMap<String, Integer> scores;
    private final HashMap<String, String> descriptions;
    private final HashMap<String, String> jobs;
    private final HashMap<String, String> hobbies;


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
                "The Anchor: Calm, dependable, and emotionally steady. Anchors thrive in structured environments and are known for their reliability, patience, and ability to remain composed under pressure.");

        descriptions.put("B",
                "The Balancer: Adaptable, open-minded, and easygoing. Balancers value harmony, adjust well to change, and often act as mediators who help maintain balance in groups.");

        descriptions.put("C",
                "The Entertainer: Energetic, expressive, and socially confident. Entertainers enjoy engaging with others, bringing enthusiasm to situations, and expressing creativity.");

        // Recommended jobs
        jobs.put("A",
                "Engineer, Project Manager, Counselor, Healthcare Professional");

        jobs.put("B",
                "Teacher, Human Resources Specialist, Consultant, Social Worker");

        jobs.put("C",
                "Actor, Marketing Specialist, Content Creator, Event Planner");

        // Recommended hobbies
        hobbies.put("A",
                "Reading, journaling, yoga, mindfulness activities");

        hobbies.put("B",
                "Traveling, photography, volunteering, exploring new interests");

        hobbies.put("C",
                "Dancing, performing arts, team sports, social media creation");
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
