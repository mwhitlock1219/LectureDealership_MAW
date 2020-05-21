package LectureDealership;

public class PendingSale<E extends Vehicle> {
    private E someVehicle;

    public PendingSale(E someVehicle) {
        this.someVehicle = someVehicle;
    }

    // Getters
    public E getSomeVehicle() {
        return this.someVehicle;
    }

    public void doSomePaper() {
        // Do something here
    }
}