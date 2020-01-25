package pl.exercise.ferry.ticket.vehicles;

import pl.exercise.ferry.ticket.VehicleTicket;
import pl.exercise.ferry.vehicle.VehicleType;
import java.math.BigDecimal;

public class CarTicket extends VehicleTicket {

    public CarTicket(String owner) {
        super(VehicleType.CAR, owner);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(20);
    }

    @Override
    public String getName() {
        return "samochód";
    }
}
