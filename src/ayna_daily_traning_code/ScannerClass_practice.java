package ayna_daily_traning_code;
import java.util.Scanner;
import java.util.SortedMap;

public class ScannerClass_practice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1 number ");
        byte num1 = scan.nextByte();

        System.out.println("Enter 2 number");
        byte num2 =scan.nextByte();
        int sum = (num1+num2); //3third ways // im byte if you passingnumber its ok but if varibale name not

        //System.out.println("Total is your sum is:"+(num1+num2)); //1 way: you can do several ways
        System.out.println("The total value: "+num1+ " and "+num2+" is: "+sum);

       /*  int sum = (num1+num2); //2 way

        System.out.println("Total is "+sum);
       */
        System.out.println("==========================================");
        System.out.println("Enter 3 number ");
        Short num3 = scan.nextShort();

        System.out.println("Enter 4 number");
        short num4 =scan.nextShort();
        int sum1 = (num2+num3); //3third ways //
        System.out.println("The total value: "+num3+ " and "+num4+" is: "+sum1);



    }
}
