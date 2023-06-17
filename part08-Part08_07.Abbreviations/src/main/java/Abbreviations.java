import java.util.HashMap;
public class Abbreviations {

    private HashMap<String, String> abbreviation;

    public Abbreviations() {
        abbreviation = new HashMap<>();
    }

    public void addAbbreviation(String abr, String explain) {
        abbreviation.put(abr, explain);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if(this.abbreviation.containsKey(abbreviation)) {
            return true;
        } else{
            return false;  
        } 
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbreviation.get(abbreviation);
    }
}
