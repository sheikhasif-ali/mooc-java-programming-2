
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont1 = 0, cont2 = 0;


    while (true) {
            System.out.println("First: " + cont1 + "/100");
            System.out.println("Second: " + cont2 + "/100");

            String input = scan.nextLine();

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = 0;
            if(!(command.equals("quit"))) {
                amount = Integer.valueOf(parts[1]);

            }

            if (command.equals("quit")) {
                break;
            } else if (command.equals("add")) {
                if(amount>0) {
                    cont1 += amount;
                }
                if(cont1>100) {
                    cont1 = 100;
                }

            } else if(command.equals("move")) {
                if(amount>cont1 && amount>0) {
                    cont2 += cont1;
                    cont1 = 0;

                } else if(amount <= cont1 && amount>0) {
                    cont2 += amount;
                    cont1 -= amount;
                } if(cont2>100) {
                    cont2 = 100;
                } if(cont1 < 0) {
                    cont1 = 0;
                }
            } else if(command.equals("remove")) {
                if(amount>cont2 && amount>0) {
                    cont2 = 0;
                } else if(amount<cont2 && amount > 0) {
                    cont2 -= amount;
                }

                if(cont2<0) {
                    cont2 = 0;
                }
            }


        }
    }

}
