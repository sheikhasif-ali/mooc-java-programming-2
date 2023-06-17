
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hm = new HashMap<>();
        hm.put("abcd", "jkl");
        hm.put("def", "mno");
        hm.put("ghi", "pqr");
        printValuesOfKeysWhere(hm, "a");
    }

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String loop : hashmap.keySet()) {
            System.out.println(loop);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        // prints the keys in the hashmap given as a parameter, which contain the string
        // given as a parameter.
        for (String loop : hashmap.keySet()) {
            if (loop.contains(text)) {
                System.out.println(loop);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        // prints the values in the given hashmap whichs keys contain the given string.
        for (String loop : hashmap.keySet()) {
            if (loop.contains(text)) {
                System.out.println(hashmap.get(loop));
            }
        }

    }

}
