package pl.exercise.ferry.ticket.vehicles;

import pl.exercise.ferry.ticket.VehicleTicket;
import pl.exercise.ferry.vehicle.VehicleType;

import java.math.BigDecimal;
import java.util.Scanner;

public class BusTicket extends VehicleTicket {

    private final Scanner in = new Scanner(System.in);

    int length;

    public BusTicket(String owner, int length) {
        super(VehicleType.BUS, owner);
        this.length = length;

    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(5*length);
    }

    @Override
    public String getName() {
        return "autobus";
    }
}
