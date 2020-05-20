//      Vehicle
//          |           |       |
//          |           |       |
//         Car        Truck    SUV
//          |
//          |
//      HybridCar

package LectureDealership;

public class HybridCar extends Car {
    private int batteryLife, MPG;
    private String chargerType;

    public HybridCar(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, int batteryLife, int MPG, String chargerType) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color);
        this.batteryLife = batteryLife;
        this.MPG = MPG;
        this.chargerType = chargerType;
    }

    // Getters
    public int getBatteryLife() {
        return this.batteryLife;
    }

    public int getMpg() {
        return this.MPG;
    }

    public String getChargerType() {
        return this.chargerType;
    }

    // Setters
    public void getBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void getMpg(int MPG) {
        this.MPG = MPG;
    }

    public void getChargerType(String chargerType) {
        this.chargerType = chargerType;
    }

}