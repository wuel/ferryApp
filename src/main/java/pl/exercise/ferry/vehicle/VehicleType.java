package pl.exercise.ferry.vehicle;

public enum VehicleType {
  CAR(1),
  BIKE(2),
  BUS(3),
  TRUCK(4),
  UKNOWN(-45);

  int choice;

  VehicleType(int choice) {
    this.choice = choice;
  }

  public static VehicleType chooseVehicle(int choice) {
    for (VehicleType vehicle : values()) {
      if (vehicle.choice == choice) {
        return vehicle;
      }
    }
    return VehicleType.UKNOWN;
  }
}
