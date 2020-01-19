package pl.exercise.ferry.ticket.vehicles;

import pl.exercise.ferry.ticket.VehicleTicket;
import pl.exercise.ferry.vehicle.VehicleType;
import java.math.BigDecimal;
import java.util.Scanner;

public class TruckTicket extends VehicleTicket {

    private final Scanner in = new Scanner(System.in);

    public TruckTicket() {
        super(VehicleType.TRUCK, "unknown");
    }

    @Override
    public BigDecimal getPrice() {
        System.out.println("Podaj wagę pojazdu w tonach!");
        int weight = in.nextInt();
        return BigDecimal.valueOf(10*weight);
    }
}
