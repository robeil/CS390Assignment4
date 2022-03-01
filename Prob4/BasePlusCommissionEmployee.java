package CS390Assignment4.Prob4;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    double getPayment() {
        return baseSalary + (getGrossSales() * getCommissionRate());
    }

    @Override
    public String toString() {
        String details = "BasePlusCommissionEmployee: " + "baseSalary: " + baseSalary;
        return details;
    }
}
