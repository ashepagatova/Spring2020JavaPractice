package day03_variableContinue;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class salary_calculater {
    public static void main(String[] args) {

        /*
        Task 08:
		Create a class called salary calculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
			ex:
				if:
					rate = 55;
					stateTax = 0.04;
					federalTax =0.22;
					weeklyHours = 40;
				then output will be:
					your salary is: 105600 USD
					your total tax is: 27456 USD
					your income after tax is: 78144 USD
				if:
					rate = 45.25;
					stateTax =0.045;
					federalTax = 0.25;
					weeklyHours = 45;
				then output will be:
					your salary is: 91260 USD
					your total tax is: 26921.7
					your income after tax: 64338.3 USD
         */
        //specify date type
          double hourlyRate = 65; //55 it depend what you make hourly
          //declaring of tax rate the current state
          double stateTaxRate =0.044;
          //declaring
          double federalTaxRate= 0.22;
          byte weeklyHour =40;
          byte totalWeeksInYear =52;
          double salary =  hourlyRate * weeklyHour * totalWeeksInYear; // ,- 52 is weekly number gross income salary before tax
         // salesTax total salary* sateTAx
           double stateTax = salary * stateTaxRate;

           double federalTax =salary * federalTaxRate;

           double salaryAfterTax =salary -(stateTax +federalTax);

         //sallary=  hourlyRate multiply *  weeklyHours * 4 week  * 12  month  weekly num multiply by 53 weeks

        System.out.println("Your Salary is: $"+salary);
        System.out.println("State Tax is $:" +stateTax);
        System.out.println("Federal Tax; $" +federalTax);
        System.out.println("Total tax is $"+(federalTax +stateTax));
        System.out.println("Salary After Tax: $" +salaryAfterTax);


    }
}
