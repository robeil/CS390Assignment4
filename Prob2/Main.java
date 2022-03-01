package CS390Assignment4.Prob2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //creating object of professor and secretary
        DeptEmployee pro1 = new Professor("Renuka",120000, LocalDate.now(),6);
        DeptEmployee pro2 =  new Professor("Muhyedin",99000,LocalDate.now(),1);
        DeptEmployee pro3 =   new Professor("Mohamed",89000,LocalDate.now(),0);
        DeptEmployee sec1 = new Secretary("Nancy",59000,LocalDate.now(),6);
        DeptEmployee sec2 = new Secretary("Angela",62000,LocalDate.of(2015,03,26),8);
       //declaring array of DepEmployee
        DeptEmployee[] department = {pro1,pro2,pro3,sec1,sec2};


        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to see the sum of Professor and Secretary salaries?\nIf yes type \"Y\" and if no \"N\"");
        String userInput = input.next();
        System.out.println("You entered: " + userInput);

        //getting and validate the input
        if(userInput.toUpperCase().charAt(0) == 'Y'){
            double sum = 0.0;
            for(int i = 0; i < department.length; i++){
                sum += department[i].computeSalary();
            }
            System.out.println("This is the sum of Professor and Secretary salaries is: "+ sum);
        } else {
            System.out.println("You wish not see and Goodbye for now.");
        }

    }
}
