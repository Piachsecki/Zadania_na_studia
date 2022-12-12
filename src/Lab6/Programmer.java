package Lab6;

import java.math.BigDecimal;

public class Programmer extends  Employee{

    private int yearsInCompany;

    public Programmer(int yearsInCompany) {
        super();
        this.yearsInCompany = yearsInCompany;
    }

    @Override
    public void calculateSalary() {
        BigDecimal bonus = calculateBonuses();
        BigDecimal taxes = BigDecimal.valueOf(8.5).
                divide(BigDecimal.valueOf(100)).
                multiply(this.getSalary());
        this.setSalary(this.getSalary().subtract(taxes).add(bonus));


    }

    @Override
    public BigDecimal calculateBonuses() {
        BigDecimal bonus = BigDecimal.ZERO;
        BigDecimal taxes = BigDecimal.valueOf(8.5).
                divide(BigDecimal.valueOf(100));
        if(yearsInCompany < 2){
            BigDecimal bounty = BigDecimal.valueOf(500);
            BigDecimal finalTaxes = taxes.multiply(bounty);
            bonus = bonus.add(bounty).subtract(finalTaxes);
        }if(yearsInCompany >= 2 && yearsInCompany <=5){
            BigDecimal bounty = BigDecimal.valueOf(2000);
            BigDecimal finalTaxes = taxes.multiply(bounty);
            bonus = bonus.add(bounty).subtract(finalTaxes);
        }if(yearsInCompany >= 5){
            BigDecimal bounty = BigDecimal.valueOf(2000);
            BigDecimal finalTaxes = taxes.multiply(bounty);
            bonus = bonus.add(bounty).subtract(finalTaxes);
        }

        return bonus;
    }

}
