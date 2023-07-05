package dictionary;

public class Main {
    public static void main(String[] args) {
        // You can test your dictionary here
        SaveableDictionary s = new SaveableDictionary("word-3110.txt");
        s.add("tietokone", "computer");
        s.save();
    }
}
