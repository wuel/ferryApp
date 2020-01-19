package pl.exercise.ferry.screen;

import pl.exercise.ferry.ticket.*;
import pl.exercise.ferry.ticket.vehicles.BikeTicket;
import pl.exercise.ferry.ticket.vehicles.BusTicket;
import pl.exercise.ferry.ticket.vehicles.CarTicket;
import pl.exercise.ferry.ticket.vehicles.TruckTicket;

import java.util.Scanner;

public class VehickleScreen implements Screen {

    private static Scanner in = new Scanner(System.in);

    @Override
    public void interact() {
        System.out.println("Wybierz typ pojazdu:");
        System.out.println(
                "1.  CAR,\n" +
                "2.  BIKE,\n" +
                "3.  BUS,\n" +
                "4.  TRUCK\n");
        int type = in.nextInt();
        Ticket ticket = VehickleScreen.getVehicleTicket(type);
        System.out.println("Cena za bilet wynosi: " + ticket.getPrice().toString());
    }


    public static Ticket getVehicleTicket(int type){
        switch(type) {
            case 1:
                return new CarTicket();
            case 2:
                return new BikeTicket();
            case 3:
                return new BusTicket();
            case 4:
                return new TruckTicket();
            default:
                break;
        }
        return null;
    }

}
