package pl.exercise.ferry.screen;

import pl.exercise.ferry.basket.Basket;
import pl.exercise.ferry.pax.PaxType;
import pl.exercise.ferry.ticket.*;
import pl.exercise.ferry.ticket.vehicles.BikeTicket;
import pl.exercise.ferry.ticket.vehicles.BusTicket;
import pl.exercise.ferry.ticket.vehicles.CarTicket;
import pl.exercise.ferry.ticket.vehicles.TruckTicket;
import pl.exercise.ferry.vehicle.VehicleType;


public class VehicleScreen extends AbstractScreen{

    VehicleScreen(ScreenManager screenManager) {
        super(screenManager);
    }


    @Override
    public void interact() {
        System.out.println("Wybierz typ pojazdu:");
        System.out.println(
                "1.  CAR,\n" +
                "2.  BIKE,\n" +
                "3.  BUS,\n" +
                "4.  TRUCK\n");
        int type = in.nextInt();
        System.out.println("Podaj imie wlasciciela pojazdu");
        String name = in.next();
        System.out.println("Podaj wiek właściciela pojazdu");
        int age = in.nextInt();
        Ticket vehicleTicket = VehicleScreen.getVehicleTicket(type, name);
        Ticket ownerTicket = PersonScreen.getPersonTicket(age, name);
        System.out.println("Cena za bilet na " + VehicleType.chooseVehicle(type) + " wynosi: " + vehicleTicket.getPrice().toString() + "zł");
        System.out.println("Cena za bilet dla " + ownerTicket.getName()+ " wynosi: " + ownerTicket.getPrice().toString() + "zl" );
        System.out.println();
    }


    public static Ticket getVehicleTicket(int type, String name){
        switch(type) {
            case 1:
                CarTicket carTicket = new CarTicket(name);
                Basket.INSTANCE.addToList(carTicket);
                Basket.INSTANCE.addAmount(carTicket.getPrice());
                return carTicket;
            case 2:
                BikeTicket bikeTicket = new BikeTicket(name);
                Basket.INSTANCE.addToList(bikeTicket);
                Basket.INSTANCE.addAmount(bikeTicket.getPrice());
                return bikeTicket;
            case 3:
                System.out.println("Podaj długosc autobusu!");
                int length = in.nextInt();
                BusTicket busTicket = new BusTicket(name,length);
                Basket.INSTANCE.addToList(busTicket);
                Basket.INSTANCE.addAmount(busTicket.getPrice());
                return busTicket;
            case 4:
                System.out.println("Podaj wagę pojazdu w tonach!");
                int weight = in.nextInt();
                TruckTicket truckTicket = new TruckTicket(name, weight);
                Basket.INSTANCE.addToList(truckTicket);
                Basket.INSTANCE.addAmount(truckTicket.getPrice());
                return truckTicket;
            default:
                break;
        }
        return null;
    }

    @Override
    public boolean isSupportingId(ScreenIdentity screenId) {
        return ScreenIdentity.VehicleScreen == screenId;
    }

}
