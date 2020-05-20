package LectureDealership;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Dealership {
    public static void main(String[] args) {
        // Instanciate new object for each Department
        ServiceDepartment sd = new ServiceDepartment();
        FinanceDepartment fd = new FinanceDepartment();
        SalesDepartment sales = new SalesDepartment();

        // Add out depts to a list
        List<Department> depts = new ArrayList<>();
        depts.add(sd);
        depts.add(fd);
        depts.add(sales);

        Department.printIsOpen(depts, LocalDateTime.now());
    }

}