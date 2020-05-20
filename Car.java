package LectureDealership;

public class Car extends Vehicle {

    // Simple contructor inheriting all the methods an properties of Vehicle
    public Car(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color);
    }

    @Override
    public double getTargetMargin() {
        return super.getTargetMargin() - 1000;
        // use the getTargetMargin method as its defined in our super class (Vehicle)
        // same as == .getRetailPrice() - this.getWholesaleCost() - 1000;
    }
}