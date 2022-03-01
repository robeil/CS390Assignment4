package CS390Assignment4.Prob2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
    //instance fields
    private double overTimeHours;

    public Secretary(String name, double salary, LocalDate hireDate,double overTimeHours){
        super(name,salary,hireDate);
        this.overTimeHours = overTimeHours;
    }

    public double getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(double overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + 12 * overTimeHours;
    }
}
