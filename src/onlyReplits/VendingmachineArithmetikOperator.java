package onlyReplits;



import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Scanner;

public class VendingmachineArithmetikOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int price = input.nextInt();
        int change = 100-price;
        int quarters = change / 25;
        int dimes = (change%25) / 10;
        int nickels = (change-quarters*25-dimes*10)/5;
        boolean itemcost = price>=25 && price<=100 && price % 5==0;
        if(itemcost){
            System.out.println("Your change is "+quarters+ " quarters, "+
                    dimes+" dimes,"+ " and "+ nickels+ " nickels.");
        }else{
            System.out.println("Invalid price!");}

    }
}
