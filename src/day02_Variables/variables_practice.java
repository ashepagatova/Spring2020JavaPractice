package day02_Variables;

public class variables_practice {
    public static void main(String[] args) {

        /*
        diclare variable  salary,tax rate ,loan ,ssn.
         */
         int salary = 1500000;
         double stateTax = 0.065;
         float federalTax = 0.18f;
         //salary -(salary*stateTax+federalTax)
        //salary after tax=salary(1-sum of taxes)
        double sumTaxes = federalTax + stateTax;
        double salaryAfterTax = salary * (1-sumTaxes);// salary after tax


        System.out.println(salaryAfterTax);


        System.out.println("===================");
         // area of circle r * r *pi


        double  r = 5.5;
        double area = r*r* 3.14;
        System.out.println(area);

        System.out.println("===================");


        double kg = 90; // put any number
        double pond = kg * 2.25;
        System.out.println(pond);

        System.out.println("======================");

        double lira = 1000;
        double liraInDollar = lira/6.15;
        System.out.println(liraInDollar);


        double rupi = 1000;
        double rupiInDollar = rupi *0.014;
        System.out.println(rupiInDollar);

        System.out.println("=================================================");
        double litter= 10000;
        double galon = litter/ 3.7;
        System.out.println(galon);















    }
}
