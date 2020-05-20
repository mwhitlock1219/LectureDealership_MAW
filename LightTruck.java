package LectureDealership;

public class LightTruck extends Vehicle {
    private long towingCapacity, grossCombinedWeight, truckWeight;
    private boolean is4wd;

    // Contructor with both inherited properties (Vehicle) and new properties.
    public LightTruck(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, long towingCapacity, long truckWeight, boolean is4wd) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color);

        this.towingCapacity = towingCapacity;
        this.truckWeight = truckWeight;
        this.is4wd = is4wd;
        this.grossCombinedWeight = this.towingCapacity + this.truckWeight;
    }

    // Getters
    public void setTowingCapacity(long towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public void setTruckWeight(long truckWeight) {
        this.truckWeight = truckWeight;
    }

    public void setGrossCominedWeight() {
        this.grossCombinedWeight = this.truckWeight + this.towingCapacity;
    }

    public void setGrossCominedWeight(long weight) {
        this.grossCombinedWeight = weight;
    }

    public void setIs4wd(boolean is4wd) {
        this.is4wd = is4wd;
    }

    @Override
    public String toString() {
        // Get the string output fromour "default" superclass method
        // example : 2018 Kia Sorrento
        // and store that in a variable for us to use
        String str = super.toString();
        // If 4WD, signify that in return string
        if (is4wd) {
            str += ", (4 WD)"; // appends string to the end of our str variable
        }
        return str;

    }

}