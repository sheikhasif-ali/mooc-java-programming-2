
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true) {
            String input = scanner.nextLine();
            if(input.equals("end")) {
                break;
            }
            list.add(input);
        }

        String input = scanner.nextLine();
        double ans = 0.0;
        if(input.equals("n")) {
            double average = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(num -> num < 0)
                .average()
                .getAsDouble();
                ans = average;
                // toteuta ohjelmasi tänne
                
            } else if(input.equals("p")) {
                double average = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(num -> num >= 0)
                .average()
                .getAsDouble();
                ans = average;

            }

            System.out.println(ans);
        
    
}
}
