package Lab6;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Employee accountant = new Accountant();
        accountant.setSalary(BigDecimal.valueOf(6000));
        accountant.calculateSalary();
        System.out.println(accountant.getSalary());
        Employee programmer = new Programmer(2);
        programmer.setSalary(BigDecimal.valueOf(6000));
        programmer.calculateSalary();
        System.out.println(programmer.getSalary());

        Employee itDepartmentEmployee = new ITDepartmentEmployee(2);
        itDepartmentEmployee.setSalary(BigDecimal.valueOf(6000));
        itDepartmentEmployee.calculateSalary();
        System.out.println(itDepartmentEmployee.getSalary());



    }
}
