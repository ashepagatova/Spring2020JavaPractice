package ayna_daily_traning_code;

import java.sql.SQLOutput;
import java.util.Scanner;

public class adress {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter Your  building number:");
        String buldingNumber = scan.next();

        scan.nextLine();// right after next  method  we  can use nextLine method

        System.out.println("Enter  Street name:");
        String streetAdress = scan.nextLine();

        System.out.println("Enter  the the city name code:");

        String  cityNamed = scan.nextLine();

        System.out.println("Enter your  state:");
        String stateName  = scan.next();

        System.out.println("Enter your  zip code:");
        String zipCode = scan.next();
        scan.nextLine();//
        System.out.println("Enter the full name:");
        String fullname = scan.nextLine();

        String ShipTo= "Ship  to: "+fullname+"\n\t\t"+buldingNumber+" "+streetAdress+
                "\n\t\t"+cityNamed+" "+zipCode;

        System.out.println(ShipTo);
    }
}
