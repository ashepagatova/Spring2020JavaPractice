package ayna_daily_traning_code;

import java.util.Scanner;

public class number_scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your number");
        int num1 = scan.nextInt();
        System.out.println("Enter Second Number");
        int num2=scan.nextInt();
        System.out.println("Enter Third Number");
        int num3 = scan.nextInt();
        //boolean totalMaxNum =(num1>num2 && num1>num3);
        int maxNum = (num1>=num2&&num1>=num3)? num1 :(num2>= num1 &&num2>num3)?num2:num3;
        int min = (num1<=num2&&num1<=num3)? num1 :(num2<= num1 &&num2<num3)?num2:num3;
        System.out.println("Is Greater "+maxNum);
        System.out.println("Min Number is "+min);





    }
}
