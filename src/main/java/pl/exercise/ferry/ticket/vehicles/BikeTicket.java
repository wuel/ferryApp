package pl.exercise.ferry.ticket.vehicles;

import pl.exercise.ferry.ticket.VehicleTicket;
import pl.exercise.ferry.vehicle.VehicleType;

import java.math.BigDecimal;


public class BikeTicket extends VehicleTicket {

    public BikeTicket() {
        super(VehicleType.BIKE, "unknown");
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(10);
    }

    @Override
    public String getName() {
        return null;
    }
}
