package CS390Assignment4.Prob4;

public class Driver {

    public static void main(String[] args) {
        //creating objects for each class
        Employee ce = new CommissionEmployee("Rob","Kidane","123-456-9658",365,0.3);
        Employee he = new HourlyEmployee("Kudus","Tekle","362-658-8521",15,8);
        Employee se = new SalariedEmployee("Merhawi","Kidane","147-258-3698",15000);
        Employee bpce = new BasePlusCommissionEmployee("Keleab","Aregawi","332-652-3254",3625,0.8,22);

        //storing the created employee
        Employee[] employees = {ce,he,se,bpce};

        //adding all the salaries in the sum variable
        double sum = 0.0;
        for(int i = 0; i < employees.length; i++){
            sum += employees[i].getPayment();
        }
        //printing the sum of the salaries
        System.out.println("Total Salaries : "+ sum);

    }
}
