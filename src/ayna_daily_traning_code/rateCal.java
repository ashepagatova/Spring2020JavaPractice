package ayna_daily_traning_code;
import java.sql.SQLOutput;
import java.util.Scanner;
public class rateCal {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
/*
White programme that calculates hourly rate
ask user the enter enter salary(ans int)
ask the user how many hours he or she works in week ;
print the hourly rate

 */
        System.out.println("Enter Your  Yearly Salary: ");
       int salary=input.nextInt();
        System.out.println("Enter How many hours you work in a week: ");
        int weeklyHours = input.nextInt();
        System.out.println("Enter How many week you work: ");
        int numWeek = input.nextInt();
        int totalSum = (salary/numWeek)/weeklyHours;
        System.out.println("Your hourly rate is $: "+totalSum);



    }
}
