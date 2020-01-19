package pl.exercise.ferry.screen;

import java.util.Scanner;

public class TicketScreen implements Screen {

    private final Scanner in = new Scanner(System.in);

    @Override
    public void interact() {
        System.out.println("WWybierz bilet który chcesz kupić");
        System.out.println("1. Osoba");
        System.out.println("2. Pojazd");
        String secondResponse = in.nextLine();
        if("1".equalsIgnoreCase(secondResponse)){
           PersonScreen personTicket = new PersonScreen();
           personTicket.interact();
            System.out.println();
        }
        if ("2".equalsIgnoreCase(secondResponse)) {
            VehickleScreen ticketVehicle = new VehickleScreen();
            ticketVehicle.interact();
            System.out.println();
        }
        MainScreen mainScreen = new MainScreen();
        mainScreen.interact();
    }
}
