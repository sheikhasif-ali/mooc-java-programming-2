
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.swing.InputMap;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (!(input.equals(""))) {
                list.add(input);
            } else {
                break;
            }

            
        }
        list.stream()
                .forEach(name -> System.out.println(name));
    }
}
