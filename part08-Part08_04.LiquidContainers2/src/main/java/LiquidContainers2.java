
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container cont1 = new Container();
        Container cont2 = new Container();


        while (true) {

        System.out.println("First: " + cont1);
        System.out.println("Second: " + cont2);

        String input = scan.nextLine();

        String[] parts = input.split(" ");

        String command = parts[0];
        int amount = 0;

        if(!(command.equals("quit"))) {
        amount = Integer.valueOf(parts[1]);

        }
        if (input.equals("quit")) {
        break;
        } else if (command.equals("add") && amount > 0) {
        cont1.add(amount);
        } else if (command.equals("move") && amount > 0) {
        if (amount > cont1.contains()) {
        cont2.add(cont1.contains());
        } else if (amount <= cont1.contains() && amount > 0) {
        cont2.add(amount);
        cont1.remove(amount);
        }

        } else if (command.equals("remove") && amount > 0) {
        cont2.remove(amount);
        }

        }
    }
}
