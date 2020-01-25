package pl.exercise.ferry.ticket.vehicles;

import pl.exercise.ferry.ticket.VehicleTicket;
import pl.exercise.ferry.vehicle.VehicleType;

import java.math.BigDecimal;


public class BikeTicket extends VehicleTicket {

    public BikeTicket(String owner) {
        super(VehicleType.BIKE, owner);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(10);
    }

    @Override
    public String getName() {
        return "motocykl";
    }
}
