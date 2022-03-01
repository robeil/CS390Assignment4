package CS390Assignment4.Prob4;

abstract public class Employee {

    private String firstName;
    private String lastName;
    private String socSecurityNumber;

    public Employee(String firstName, String lastName,String socSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNumber = socSecurityNumber;
    }

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

    public String getSocSecurityNumber() {
        return socSecurityNumber;
    }

    public void setSocSecurityNumber(String socSecurityNumber) {
        this.socSecurityNumber = socSecurityNumber;
    }

    //abstract method
    abstract double getPayment();

    @Override
    public String toString() {
        String details = "Employee firstName: '" + firstName + ", lastName: '" + lastName + ", socSecurityNumber: '" + socSecurityNumber;
        return details;
    }
}
