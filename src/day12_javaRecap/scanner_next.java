package day12_javaRecap;
import java.util.Scanner;
public class scanner_next {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

//       String str = scan.next();
//       System.out.println(str); // enter 1 word Ayna chishik will print only chishik

         String fullAdress = "";
         //7199 JonesBranch Dr, Mclean Va, 22034.

        System.out.println("Enter number of building: ");
        short buldingNumber = scan.nextShort();
        fullAdress +=buldingNumber+" ";

        System.out.println("Enter street name: ");
        String streetName =scan.next();
        fullAdress+= streetName+ "";

        System.out.println("Enter the type of the road ");
        String roadType = scan.next();
        fullAdress+=roadType+ ", ";

        System.out.println("City name: , State , zip code");
        String cityName = scan.next();
        fullAdress+=cityName+" ";

        String state=scan.next();
        fullAdress+=state+ ", ";

        int zipCode =scan.nextInt();
        fullAdress+=zipCode;






    }



}

