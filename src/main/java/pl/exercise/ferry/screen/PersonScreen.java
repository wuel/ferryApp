package pl.exercise.ferry.screen;

import pl.exercise.ferry.basket.Basket;
import pl.exercise.ferry.pax.PaxType;
import pl.exercise.ferry.ticket.Ticket;
import pl.exercise.ferry.ticket.persons.AdultTicket;
import pl.exercise.ferry.ticket.persons.ChildTicket;
import pl.exercise.ferry.ticket.persons.SeniorTicket;
import pl.exercise.ferry.ticket.persons.YoungTicket;


public class PersonScreen extends AbstractScreen {

    PersonScreen(ScreenManager screenManager) {
        super(screenManager);
    }

    @Override
    public void interact() {
        System.out.println("Podaj imie pasazera");
        cleanBuffer();
        String name = in.nextLine();
        System.out.println("Podaj wiek dla kogo bilet?");
        int age = in.nextInt();
        Ticket ticket = PersonScreen.getPersonTicket(age, name);
        System.out.println("Kupiles bilet dla: " + PaxType.fromAge(age) + "\n" + "Cena za bilet wynosi: " + ticket.getPrice().toString() + "zl" );
    }


    private static Ticket getPersonTicket(int age, String name){
        switch (PaxType.fromAge(age)) {
            case CHILD:
                ChildTicket child = new ChildTicket(name);
                Basket.INSTANCE.addAmount(child.getPrice());
                Basket.INSTANCE.addToList(child);
                return child;
            case YOUNG:
                YoungTicket young = new YoungTicket(name);
                Basket.INSTANCE.addAmount(young.getPrice());
                Basket.INSTANCE.addToList(young);
                return young;
            case ADULT:
                AdultTicket adult = new AdultTicket(name);
                Basket.INSTANCE.addAmount(adult.getPrice());
                Basket.INSTANCE.addToList(adult);
                return adult;
            case SENIOR:
                SeniorTicket senior = new SeniorTicket(name);
                Basket.INSTANCE.addAmount(senior.getPrice());
                Basket.INSTANCE.addToList(senior);
                return senior;
            case UKNOWN:
                System.out.println("Nie wiem jak tu trafiles, zly wiek!!");
                break;
            default:
                break;
        }
        return null;
    }

    @Override
    public boolean isSupportingId(ScreenIdentity screenId) {
        return ScreenIdentity.PersonScreen == screenId;
    }

}


