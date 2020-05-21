package LectureDealership;

public class LeaseVehicleFactory {
    public static Leaseable getLeaseableVehicleByVin(String VIN) {
        Leaseable leaseable = null;

        // These methods called haven't been created, using as an example
        String vehicleType = decodeVinForType(VIN);
        if (vehicleType.equals("Car")) {
            leaseable = getCarDetails(VIN);
        } else if (vehicleType.equals("LightTruck")) {
            leaseable = getTruckDetails(VIN);
        }
        return leaseable;
    }
}