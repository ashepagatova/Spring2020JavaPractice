package day11_Scanner;
import java.util.Scanner;
public class employeinfo_Scanner {
    public static void main(String[] args) {
        /*
        Task: Scanner_Practice1
    1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
    4. if he is employeed , ask the salary
    4. if he is not employeed set the salary to 0
    output:
        full name:
        employeeed status:
        salary:
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Employee only Enter your name ");

        String firstName = scan.next();

        System.out.println("Enter your Last Name");
        String lasttName = scan.next();
        String fullName= firstName+ " "+lasttName;
        System.out.println("Are you employed");

        boolean employeeStatus = scan.nextBoolean();

         double salary =0;

         if(employeeStatus == true){
            System.out.println("Enter your Salary");
            salary = scan.nextDouble();
        }

        System.out.println("Full name is:" +fullName);
        System.out.println("Employeed: "+employeeStatus);
        System.out.println("Employee"+salary);



    }


}
