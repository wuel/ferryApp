package pl.exercise.ferry.basket;

import pl.exercise.ferry.ticket.persons.AdultTicket;
import pl.exercise.ferry.ticket.persons.ChildTicket;
import pl.exercise.ferry.ticket.persons.SeniorTicket;
import pl.exercise.ferry.ticket.persons.YoungTicket;
import pl.exercise.ferry.ticket.vehicles.BikeTicket;
import pl.exercise.ferry.ticket.vehicles.BusTicket;
import pl.exercise.ferry.ticket.vehicles.CarTicket;
import pl.exercise.ferry.ticket.vehicles.TruckTicket;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

    String id;
    String path = "D:\\projekty\\java\\ferryApp\\files\\";
    File file = new File(path);

    public Reader() {
    }

    public void readFile(String id) throws FileNotFoundException {
        String newPath = path + id + ".txt";
        File file = new File(newPath);
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String newLine = sc.nextLine();
            String[] newTab = newLine.split(";");
            if (newTab[0].equalsIgnoreCase("child")){
                ChildTicket child = new ChildTicket(newTab[1], Integer.parseInt(newTab[2]));
                Basket.INSTANCE.ticketList.add(child);
                Basket.INSTANCE.addAmount(child.getPrice());
            }
            if (newTab[0].equalsIgnoreCase("young")){
                YoungTicket young = new YoungTicket(newTab[1], Integer.parseInt(newTab[2]));
                Basket.INSTANCE.ticketList.add(young);
                Basket.INSTANCE.addAmount(young.getPrice());
            }
            if (newTab[0].equalsIgnoreCase("adult")){
                AdultTicket adult = new AdultTicket(newTab[1], Integer.parseInt(newTab[2]));
                Basket.INSTANCE.ticketList.add(adult);
                Basket.INSTANCE.addAmount(adult.getPrice());
            }
            if (newTab[0].equalsIgnoreCase("senior")){
                SeniorTicket senior = new SeniorTicket(newTab[1], Integer.parseInt(newTab[2]));
                Basket.INSTANCE.ticketList.add(senior);
                Basket.INSTANCE.addAmount(senior.getPrice());
            }
            if (newTab[0].equalsIgnoreCase("bike")) {
                BikeTicket bike = new BikeTicket(newTab[1]);
                Basket.INSTANCE.ticketList.add(bike);
                Basket.INSTANCE.addAmount(bike.getPrice());
            }
            if (newTab[0].equalsIgnoreCase("car")) {
                CarTicket car = new CarTicket(newTab[1]);
                Basket.INSTANCE.ticketList.add(car);
                Basket.INSTANCE.addAmount(car.getPrice());
            }
            if (newTab[0].equalsIgnoreCase("bus")) {
                BusTicket bus = new BusTicket(newTab[1], Integer.parseInt(newTab[2]));
                Basket.INSTANCE.ticketList.add(bus);
                Basket.INSTANCE.addAmount(bus.getPrice());
            }
            if (newTab[0].equalsIgnoreCase("truck")) {
                TruckTicket truck = new TruckTicket(newTab[1], Integer.parseInt(newTab[2]));
                Basket.INSTANCE.ticketList.add(truck);
                Basket.INSTANCE.addAmount(truck.getPrice());
            }
        }
    }
}








