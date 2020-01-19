package pl.exercise.ferry.screen;

import pl.exercise.ferry.pax.PaxType;
import pl.exercise.ferry.ticket.Ticket;
import pl.exercise.ferry.ticket.persons.AdultTicket;
import pl.exercise.ferry.ticket.persons.ChildTicket;
import pl.exercise.ferry.ticket.persons.SeniorTicket;
import pl.exercise.ferry.ticket.persons.YoungTicket;

import java.util.Scanner;

public class PersonScreen implements Screen {

    private final Scanner in = new Scanner(System.in);

    @Override
    public void interact() {
        System.out.println("Podaj wiek dla kogo bilet?");
        int age = in.nextInt();
        Ticket ticket = PersonScreen.getPersonTicket(age);
        System.out.println("Kupiles bilet dla: " + PaxType.fromAge(age) + "\n" + "Cena za bilet wynosi: " + ticket.getPrice().toString() + "zl" );
    }

    private static Ticket getPersonTicket(int age){
        switch (PaxType.fromAge(age)) {
            case CHILD:
                return new ChildTicket();
            case YOUNG:
                return new YoungTicket();
            case ADULT:
                return new AdultTicket();
            case SENIOR:
                return new SeniorTicket();
            case UKNOWN:
                System.out.println("Nie wiem jak tu trafiles, zly wiek!!");
                break;
            default:
                break;
        }
        return null;
    }

}


