package LectureDealership;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Dealership {
    public static void main(String[] args) {
        Leaseable lease = new Car("52430899FD", 33000.00, 42000.00, 2019, "Chevrolet", "Impala", "White",
                VehicleClassification.NEW);

        System.out.println("Number of months to lease: " + lease.getLeaseTerm());

        // // Instanciate new object for each Department
        // ServiceDepartment sd = new ServiceDepartment();
        // FinanceDepartment fd = new FinanceDepartment();
        // SalesDepartment sales = new SalesDepartment();

        // // Add out depts to a list
        // List<Department> depts = new ArrayList<>();
        // depts.add(sd);
        // depts.add(fd);
        // depts.add(sales);
        // // Print out if depts are open
        // Department.printIsOpen(depts, LocalDateTime.now());
    }

}