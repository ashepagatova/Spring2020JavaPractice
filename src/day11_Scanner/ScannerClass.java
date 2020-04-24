package day11_Scanner;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter");
       // System.out.println((long)2.5);
        //int a = 9999999999;
        long a = scan.nextLong(); // it will return as long primitive
        // you cannot assign long
        System.out.println("You have entered:  "+a);
        double b = (long) scan.nextLong(); // you can cast to from float to the long
        //long b = (long) scan.nextLong(); // you can cast to from float to the long
        // you cannot assign long
        System.out.println("You have entered:  "+b);

        System.out.println("enter the decemal number");
        double f = scan.nextDouble();
        System.out.println("enter the decemal number"+f);
        System.out.println("Enter true pr false");
        boolean bool = scan.nextBoolean();
        System.out.println(bool);




    }
}
