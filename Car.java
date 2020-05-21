package LectureDealership;

// Convention dictates that "imlements" come after "extends" if present
public class Car extends Vehicle implements Leaseable {

    // Simple contructor inheriting all the methods an properties of Vehicle
    public Car(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
    }

    @Override
    public double getTargetMargin() {
        return super.getTargetMargin() - 1000;
        // use the getTargetMargin method as its defined in our super class (Vehicle)
        // same as == .getRetailPrice() - this.getWholesaleCost() - 1000;
    }

    @Override
    public boolean isLeaseable() {
        return true;
    }

    public in getLeaseTerm() {
        return 24;
    }

    public int getMaxMilesPerYear() {
        return 15_000;
    }
}