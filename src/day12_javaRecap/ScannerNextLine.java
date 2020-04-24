package day12_javaRecap;
import java.util.Scanner;

public class ScannerNextLine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //int number = scan.nextInt();
        System.out.println("Enter the building number: ");

       String Bnumber=scan.next();/// 1234+ enter or int

        System.out.println("Building number: ");

        scan.nextLine();
        System.out.println("Street: ");

        String street =scan.nextLine();
        System.out.println("Street is "+street);

        System.out.println("Enter the zip code: ");
        int zipCode=scan.nextInt();
        scan.nextLine();
        System.out.println("Entere the city name and state seperated by commma and space");

        String cityAndState =scan.nextLine();


        String fullAdress = Bnumber+ " "+street+", "+cityAndState+ " "+zipCode;

        System.out.println(fullAdress);

        scan.close(); // closes scanner

    }
}
