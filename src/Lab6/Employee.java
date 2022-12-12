package Lab6;

import java.math.BigDecimal;

public abstract class Employee implements CalculationService {
    private String firstName;
    private String lastName;
    private BigDecimal salary;

    public String getFirstName() {
        return firstName;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public void calculateSalary() {

        if(this instanceof Accountant){
            BigDecimal bonus = calculateBonuses();
            BigDecimal taxes = BigDecimal.valueOf(17).
                    divide(BigDecimal.valueOf(100)).
                    multiply(this.salary);

           this.salary = this.salary.subtract(taxes).add(bonus);
        }

    }

    @Override
    public BigDecimal calculateBonuses() {
        BigDecimal taxes = BigDecimal.valueOf(17).
                divide(BigDecimal.valueOf(100));
        BigDecimal bonus = BigDecimal.ZERO;
        if(this instanceof Accountant){
            BigDecimal bounty = this.salary.multiply(BigDecimal.TEN).
                    divide(new BigDecimal(100));
            BigDecimal finalTaxes = taxes.multiply(bounty);
            bonus = bonus.add(bounty).subtract(finalTaxes);
        }


        return bonus;
    }
}
