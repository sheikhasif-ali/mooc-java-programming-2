
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();
        float total = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num > 0) {
                numList.add(num);
            } else if (num == 0) {
                if (numList.size() == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                } else{
                    for (int loop : numList) {
                        total += loop;
                    }
                    System.out.println(total / numList.size());
                    break;
                }
            }

        }

    }
}
