package pl.exercise.ferry.ticket.vehicles;

import pl.exercise.ferry.ticket.VehicleTicket;
import pl.exercise.ferry.vehicle.VehicleType;

import java.math.BigDecimal;
import java.util.Scanner;

public class BusTicket extends VehicleTicket {

    private final Scanner in = new Scanner(System.in);

    public BusTicket() {
        super(VehicleType.BUS, "unknown");
    }

    @Override
    public BigDecimal getPrice() {
        System.out.println("Podaj długosc autobusu!");
        int length = in.nextInt();
        return BigDecimal.valueOf(5*length);
    }

    @Override
    public String getName() {
        return null;
    }
}
