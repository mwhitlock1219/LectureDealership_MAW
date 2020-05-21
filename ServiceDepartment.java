package LectureDealership;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class ServiceDepartment extends Department {

    public ServiceDepartment() {
        super("Service", 20);
    }

    // Create Association relationship b/w Vehicle and Service Department
    // Very loose, lifetime of objects are independent of one another
    public boolean changeEngineOil(Vehicle v) {
        // Because ServiceDpt doesnt "own" the lifetime of the object its good practice
        // to ensure a valid object hass ben passed in
        if (v != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isOpenToday(LocalDateTime day) {
        if (day.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            return false;
        } else {
            return true;
        }
    }
}