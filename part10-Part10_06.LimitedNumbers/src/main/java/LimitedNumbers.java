
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true) {
            Integer input = Integer.valueOf(scanner.nextLine());
            if(input > 0) {
                list.add(input);
            } else {
                break;
            }
        }

        list.stream()
            .filter(num -> num > 0 && num < 6)
            .forEach(name -> System.out.println(name));
    }
}
