import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> list = new ArrayList<>();

        while (true) {
            String name;
            int age;
            System.out.println("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                name = input;
                System.out.println("Input the age recommendation: ");
                input = scanner.nextLine();
                age = Integer.valueOf(input);

                list.add(new Book(name, age));

            }
        }

        System.out.println(list.size() + " books in total.\nBooks:\n");

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);

        Collections.sort(list, comparator);
        
        for (Book book : list) {
            System.out.println(book);
        }

    }

}
