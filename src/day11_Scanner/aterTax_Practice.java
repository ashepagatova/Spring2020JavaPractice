package day11_Scanner;

import java.util.Scanner; // import PachageName.ClassName
public class aterTax_Practice {

    public static void main(String[] args) {
        /*
        1. Wash Your hands
        2. write a program that can calculate the salary after tax
                needed information:
                                employee' salaray
                                state tax
                                federal tax
                   */
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter Salary");
    int  salary =  scan.nextInt();

    System.out.println("Enter Statel Tax");
    int  stateTax =  scan.nextInt();

    double stateTaxPrecentage= stateTax/100.0;
    System.out.println("Enter the Federal Tax");
    int  federalTax =  scan.nextInt();

    double federalTaxprecentage =federalTax/100.0; //10/3.0==>3.3333
    // totalTax =(federalTaxPrecentage +stateTaxPrecentage) *salary
    double totalTax =(federalTaxprecentage +stateTaxPrecentage) *salary;

    // System.out.println(salary+" Salary" +stateTax+ "State Tax" +federalTax+ " Fedel Tax " +toralAfterTax);
    // salaryAfterx = salary -totalTax;
    double salaryAfterTax =salary-totalTax;

    System.out.println("Your salary aftertax is "+salaryAfterTax);
    System.out.println("Total tax: $"+totalTax);








    }
}
