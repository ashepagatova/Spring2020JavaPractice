package day11_Scanner;
import java.util.Scanner;
public class nextLine2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = input.nextInt(); // 30+ Enter2
        input.nextLine();//

        System.out.println("Enter your full name: "+age);
        String fullName = input.nextLine();
        System.out.println("Your full name is: "+fullName);



    }

}
