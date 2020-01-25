package pl.exercise.ferry.ticket;

import pl.exercise.ferry.vehicle.VehicleType;


public abstract class VehicleTicket implements Ticket {

  private final VehicleType vehicleType;
  private final String owner;

  public VehicleTicket(VehicleType vehicleType, String owner) {
    this.vehicleType = vehicleType;
    this.owner = owner;
  }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getOwner() {
        return owner;
    }
}
