package CS390Assignment4.Prob4;

public class HourlyEmployee extends Employee{

    private double wage;
    private double hours;

    public HourlyEmployee(String firstName,String lastName,String socSecurityNumber,double wage,double hours){
        super(firstName, lastName, socSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return this.wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return this.hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    double getPayment() {
        return this.wage * this.hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee: " +
                "wage: " + wage +
                ", hours: " + hours;
    }
}
