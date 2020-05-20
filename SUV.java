package LectureDealership;

public class SUV extends Vehicle {
    // Simple contructor inheriting all the methods an properties of Vehicle
    public SUV(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color);
    }
}