import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private TodoList todolist;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scan = scanner;
        this.todolist = list;
    }
    
    public void start() {
        while(true) {
            String command = scan.nextLine();

            if(command.equals("add")) {
                System.out.print("To add: ");
                String task = scan.nextLine();
                todolist.add(task);
            } else if(command.equals("list")) {
                todolist.print();
            } else if(command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int number = Integer.valueOf(scan.nextLine());
                todolist.remove(number);
            } else if (command.equals("stop")) {
                break;
            }
        }
    }
}