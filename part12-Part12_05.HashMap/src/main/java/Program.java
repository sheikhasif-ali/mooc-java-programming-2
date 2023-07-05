
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pair<String, Integer> pair1 = new Pair<>("key1", 1);
        Pair<String, Integer> pair2 = new Pair<>("key2", 2);
        Pair<String, Integer> pair3 = new Pair<>("key3", 3);

        HashMap<String, Integer> map = new HashMap();

        map.add("key1", 1);
        map.add("key2", 2);
        map.add("key3", 3);
        map.add("key4", 4);

        System.out.println(map.toString());

        map.remove("key3");

        System.out.println(map.toString());






    }

}
