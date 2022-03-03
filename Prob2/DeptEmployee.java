package CS390Assignment4.Prob2;

import java.time.LocalDate;

public class DeptEmployee implements Cloneable{
    //instance field
    private String name;
    private double salary;
    private LocalDate hireDate;

    //constructor
    public DeptEmployee(String name, double salary,LocalDate hireDate){
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
       // return hireDate;
       return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public double computeSalary(){
        return salary;
    }
}
