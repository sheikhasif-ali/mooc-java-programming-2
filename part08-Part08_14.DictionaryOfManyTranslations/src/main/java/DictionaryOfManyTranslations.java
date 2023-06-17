import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dict;

    public DictionaryOfManyTranslations() {
        this.dict  = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dict.putIfAbsent(word, new ArrayList<>());

        this.dict.get(word).add(translation);

    }

    public ArrayList<String> translate(String word) {
        if(!(dict.containsKey(word))) {
            ArrayList<String> empty = new ArrayList<>();
            return empty;
        }
        return dict.get(word);
    }

    public void remove(String word) {
        dict.remove(word);
    }
}
