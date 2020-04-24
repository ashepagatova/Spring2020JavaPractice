package day11_Scanner;
import  java.util.Scanner;
public class NextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: "); // accepts "enter" double click
        String fullName = scan.nextLine();

        System.out.println("Your full name is"+fullName);
        System.out.println("Enter your sentace ");//

        String sentace = scan.nextLine();
        System.out.println("enter"+sentace);


    }
}
