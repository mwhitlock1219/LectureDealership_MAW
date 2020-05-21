package LectureDealership;

public class LightTruck extends Vehicle {
    private long towingCapacity, grossCombinedWeight, truckWeight;
    private boolean is4wd;

    // Constructor with both inherited properties and new properites
    public LightTruck(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, long towingCapacity, long truckWeight, boolean is4wd, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
        this.towingCapacity = towingCapacity;
        this.truckWeight = truckWeight;
        this.is4wd = is4wd;
        this.grossCombinedWeight = this.towingCapacity + this.truckWeight;

        if (this.is4wd == true) {
            // Create new TransferCase object if LightTruck is 4WD
            // and store object in variable xferCase
            this.xferCase = new TransferCase();
        }
    }

    // Getters
    public long getTowingCapacity() {
        return this.towingCapacity;
    }

    public long getTruckWeight() {
        return this.truckWeight;
    }

    public long getGrossCombinedWeight() {
        return this.grossCombinedWeight;
    }

    public boolean getIs4wd() {
        return this.is4wd;
    }

    // Setters
    public void setTowingCapacity(long towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public void setTruckWeight(long weight) {
        this.truckWeight = weight;
    }

    // Method to automatically calculate GCW if no params given
    public void setGrossCombinedWeight() {
        this.grossCombinedWeight = this.truckWeight + this.towingCapacity;
    }

    // Method Overload to manually set GCW if param is provided
    public void setGrossCombinedWeight(long weight) {
        this.grossCombinedWeight = weight;
    }

    public void setIs4wd(boolean is4wd) {
        this.is4wd = is4wd;
    }

    @Override
    public String toString() {
        // Get the string output from our "default" superclass method
        // Example: 2018 Kia Sorrento
        // and store that in a variable for us to use
        String str = super.toString();
        // If 4WD, signify that in return string
        if (is4wd) {
            str += ", (4 WD)"; // appends string to end of our str variable
        }
        return str;
    }

    public class TransferCase {
        private int numGears;

        public TransferCase() {
            this.numGears = 4;
        }

        public TransferCase(int gears) {
            this.numGears = gears;
        }

        public int getNumGears() {
            return this.numGears;
        }

    }

    public TransferCase xferCase;
}