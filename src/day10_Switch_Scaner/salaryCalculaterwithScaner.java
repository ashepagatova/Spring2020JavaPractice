package day10_Switch_Scaner;

import java.sql.SQLOutput;
import java.util.Scanner;
public class salaryCalculaterwithScaner {
    public static void main(String[] args) {

/*
 write a program for the rate calculater: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate

*/
/*
        Scanner input3 = new Scanner(System.in);

        System.out.println(" Enter the salary");

        int salary = input3.nextInt();

        System.out.println("how many hours you worked");

        byte hours= input3.nextByte();

        int rate= salary*hours ;

        System.out.println("total" +rate);

*/

/*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary = input.nextInt();
        System.out.println("Enter how many hours you work per week: ");
        int hoursPerWeek = input.nextInt();
        int hourlyRate = salary * hoursPerWeek;
        System.out.println("Your Hourly rate is: " + hourlyRate);
*/


     Scanner scan = new Scanner(System.in);
      System.out.println("Please Enter your salary");

       int salary = scan.nextInt();

        System.out.println("Please Enter how many hours you work per week");

        byte weeklyHour = scan.nextByte();

        System.out.println("How many weeks do you work in year");

        byte numOfWeek = scan.nextByte();

        int hourlyRate =(salary/numOfWeek)/ weeklyHour;

        System.out.println("Your total rate is "+hourlyRate);
        // hour = (salary /numOfWeek / weekly hours)






    }





}
