package LectureDealership;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class ServiceDepartment extends Department {

    public ServiceDepartment() {
        super("Service", 20);
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