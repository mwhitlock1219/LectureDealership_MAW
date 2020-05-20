package LectureDealership;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Department {
    private String deptName;
    private int numEmployees;

    public Department() {
        this.deptName = "Generic";
        this.numEmployees = 0;
    }

    public Department(String name, int numEmployees) {
        this.deptName = name;
        this.numEmployees = numEmployees;
    }

    public static void printIsOpen(List<Department> depts, LocalDateTime today) {
        // cycle thorugh each department in provided list
        for (Department d : depts) {
            // Print out name of Dept and return if that department is opent today
            System.out.println(d.toString() + " is open today?" + d.isOpenToday(today));
            // Use instanceof keyword to test if item in list is of a certain object or data
            // type
            if (d instanceof ServiceDepartment) {
                System.out.println(d.toString() + " only closes on Sundays.");
            }
        }
    }

    public abstract boolean isOpenToday(LocalDateTime day);

    @Override
    public String toString() {
        return this.deptName + " Department";
    }

}