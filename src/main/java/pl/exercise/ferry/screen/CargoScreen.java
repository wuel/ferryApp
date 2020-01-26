package pl.exercise.ferry.screen;

import pl.exercise.ferry.basket.Basket;
import pl.exercise.ferry.pax.PaxType;
import pl.exercise.ferry.ticket.CargoTicket;
import pl.exercise.ferry.ticket.Ticket;
import pl.exercise.ferry.ticket.TicketType;

import java.io.IOException;

public class CargoScreen extends AbstractScreen{

    CargoScreen(ScreenManager screenManager) {
        super(screenManager);
    }

    @Override
    public void interact() {
        System.out.println("Podaj imię nadawcy paczki");
        String owner = in.next();
        System.out.println("Podaj objętość towaru w m^3, cena za 1 m^3 wynosi 50zł");
        double volume = in.nextDouble();
        Ticket ticket = CargoScreen.getCargoTicket(owner, volume);
        System.out.println("Kupiles bilet na łądunek o objętości " + ((CargoTicket) ticket).getVolume() + "\n" + "Cena za bilet wynosi: " + ticket.getPrice().toString() + "zl" );
        System.out.println();

    }

    public static Ticket getCargoTicket(String owner, double volume) {
        CargoTicket cargoTicket = new CargoTicket(TicketType.CARGO, owner, volume);
        Basket.INSTANCE.addAmount(cargoTicket.getPrice());
        Basket.INSTANCE.ticketList.add(cargoTicket);
        return cargoTicket;
    }

    @Override
    public boolean isSupportingId(ScreenIdentity screenId) {
        return false;
    }
}
