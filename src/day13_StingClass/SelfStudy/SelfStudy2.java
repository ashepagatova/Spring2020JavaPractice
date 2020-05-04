package day13_StingClass.SelfStudy;

import java.util.Scanner;

public class SelfStudy2 {
    public static void main(String[] args) {

        //shippingInfo

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the building number");
        String buldingNumber = s.nextLine();
        System.out.println("Enter the street address");
        String streeAdress =  s.nextLine();


        System.out.println("Enter City Name");
        String cityName = s.nextLine();
        System.out.println("Enter State");
        String State = s.next();

        s.nextLine();

        System.out.println("Enter Zip code");
        String zip = s.nextLine();

        System.out.println("Enter your Fullname");
        String fullName = s.nextLine();


        String  shipInfo  = "Ship To:"+ fullName +"\n" +buldingNumber+ " "+streeAdress+ "\n" +cityName+ " "+State+" " +zip;
        System.out.println(shipInfo);










    }
}
