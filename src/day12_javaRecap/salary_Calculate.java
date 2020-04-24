package day12_javaRecap;
import java.sql.SQLOutput;
import java.util.Scanner;
public class salary_Calculate {
    public static void main(String[] args) {


       /* Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Salary");
        double salary =scan.nextDouble(); ///100000 enter

        scan.nextLine(); /// enter
        System.out.println("Enter your full name");

        String fullName = scan.nextLine();
        //scan.nextLine();

        System.out.println("Enter company name");
        String companyName = scan.nextLine();
        System.out.println("Enter the SSN");
        double ssn =scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter Job Title");
        String jobTitle =scan.nextLine();
        System.out.println("Full name is "+fullName);
        System.out.println("Job Title" +jobTitle);
        System.out.println("Company Name "+companyName);
        System.out.println("Enter ssn" +ssn);
        System.out.println("Salary"+salary);*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons:");

        int numberOfCoupon = scan.nextInt();
        int numberOfCandyBar = numberOfCoupon/10;
        int numberOfGumballs = (numberOfCoupon%10)/3;
        String total = " ";

        if(numberOfCoupon>=3){
        total ="Number of Candies:"+numberOfCandyBar+" \nNumber of Gumballs: "+numberOfGumballs;
        } else {
        total="Not enough coupons" + numberOfCoupon;

        }
        System.out.println(total);








    }

}
