
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        // Write your program here
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("end")) {
                break;
            } 
            list.add(input);
        }

        double average = list.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .average()
            .getAsDouble();

        System.out.println("The average is: " + average );

    }
}
