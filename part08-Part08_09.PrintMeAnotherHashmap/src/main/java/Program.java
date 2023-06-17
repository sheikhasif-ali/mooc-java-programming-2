
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        // printValueIfNameContains(hashmap, "prejud");
        // Test your program here!
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for(Book loop : hashmap.values())
        System.out.println(loop);
       
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for(Book loop : hashmap.values()) {
            if(loop.getName().contains(text)) {
                System.out.println(loop);
            }
        }
        
    }
}
