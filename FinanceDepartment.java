package LectureDealership;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class FinanceDepartment extends Department {
    public FinanceDepartment() {
        super("Finance", 10);
    }

    @Override
    public boolean isOpenToday(LocalDateTime day) {
        // return false if it is Sat or Sun
        if (day.getDayOfWeek().equals(DayOfWeek.SUNDAY) || day.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
            return false;
        } else {
            return true;
        }
    }
}