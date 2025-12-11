import java.util.HashMap;

public class PersonalityTypes {

    private HashMap<String, String> typeDescriptions; 

    public PersonalityTypes(){
        typeDescriptions = new HashMap<>();
    
        typeDescriptions.put("Introvert", "You are reflective and enjoy solitary activities.");
        typeDescriptions.put("Extrovert", "You are outgoing and thrive in social settings.");
        typeDescriptions.put("Ambivert", "You have a balance of introvert and extrovert features.");
        typeDescriptions.put("Thinker", "You make decisions based on logic and reason.");
        typeDescriptions.put("Feeler", "You make decisions based on emotions and values.");
        
    }
    public String getDescription(String type) {
        return typeDescriptions.getOrDefault(type, "Description not found.");               
    }


}
