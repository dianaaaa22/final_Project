import java.util.HashMap;

public class PersonalityTrait{
    private HashMap<String, Integer> scores;

    public PersonalityTrait() {
        scores = new HashMap<>();
        scores.put("A",0);
        scores.put("B",0);
        scores.put("C",0);
        scores.put("D",0);
    }

    public void addScore(String type) {
        scores.put(type, scores.get(type)+1);
    }

    public String getTopType() {
        String best = null;
        int max = -1;

        for(String type : scores.keySet()) {
            if(scores.get(type) > max) {
                max = scores.get(type);
                best = type;
            }
        }
        return best;
    }
    public HashMap<String, Integer> getScores() {
        return scores;
    }
}