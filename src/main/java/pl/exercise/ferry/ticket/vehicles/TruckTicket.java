package pl.exercise.ferry.ticket.vehicles;

import pl.exercise.ferry.ticket.VehicleTicket;
import pl.exercise.ferry.vehicle.VehicleType;
import java.math.BigDecimal;
import java.util.Scanner;

public class TruckTicket extends VehicleTicket {

    private final Scanner in = new Scanner(System.in);

    int weight;



    public TruckTicket(String owner, int weight) {
        super(VehicleType.TRUCK, owner);
        this.weight = weight;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(10*weight);
    }

    @Override
    public String getName() {
        return "ciężarówka";
    }

    public int getWeight() {
        return weight;
    }

}
