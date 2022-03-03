package CS390Assignment4.Prob4;

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String firstName,String lastName,String socSecurityNumber,double weeklySalary){
        super(firstName, lastName, socSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    double getPayment() {
        return this.weeklySalary;
    }


}
