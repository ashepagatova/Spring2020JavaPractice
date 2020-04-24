package day12_javaRecap;
import java.util.Scanner;
public class scanner_nextline {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some number");
        //String name =scan.next();// enter+enter+enter "Muhtar"

        int num=scan.nextInt();// 13+ enter
        System.out.println(num);
        scan.nextLine();

        System.out.println("Enter Your name:");
        String name =scan.nextLine();// enter+enter+enter "Muhtar"
        System.out.println(name);


    }


}
