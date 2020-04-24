package onlyReplits;
import java.util.Scanner;
public class workOnOwn {
    public static void main(String[] args) {

        plus();
    }

    public static void plus(){

        //your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number:");
        int num = scan.nextInt();
        System.out.println("enter second number:");
        int num2 = scan.nextInt();
        int result = num+num2;
        System.out.println("result:"+result);

    }


}
