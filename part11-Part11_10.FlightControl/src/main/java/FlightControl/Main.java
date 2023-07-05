package FlightControl;

import java.util.Scanner;

import FlightControl.logic.FlightControl;
import FlightControl.ui.*;

public class Main {

    public static void main(String[] args) {
        FlightControl fc = new FlightControl();
        Scanner scanner = new Scanner(System.in);

        UI ui = new UI(fc, scanner);
        ui.start();
        // Write the main program here. It is useful to create some classes of your own.
    }
}
