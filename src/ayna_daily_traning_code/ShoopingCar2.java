package ayna_daily_traning_code;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ShoopingCar2 {
    public static void main(String[] args) {
        //Create a Scanner object named scan.
        //-Declare 4 String variables item1, item2, item3, report.
        Scanner scan = new Scanner(System.in);

        String item1 = "";
        System.out.println("Enter Item1:");
        int count1 =scan.nextInt();
        System.out.println("Price1:");
        double price1 = scan.nextDouble();

        String item2 = "";
        System.out.println("Enter Item2:");
        int count2 =scan.nextInt();
        System.out.println("Price2:");
        double price2 =scan.nextDouble();

        String item3 = "";
        System.out.println("EnterItem3:");
        int count3 =scan.nextInt();//-Declare int variables count1, count2, count3
        System.out.println("Price:");
        double price3 =scan.nextDouble();
        //-Declare double variables price1, price2, price3, totalPrice
//        System.out.println("Get count:");
//        int getCount=scan.nextInt();
//        System.out.println("Total price:");
//        double totalPrice =scan.nextDouble();
        double totalPrice1 = price1*count1;
        double totalPrice2 = price2*count2;
        double totalPrice3 = price3*count3;
        double total= totalPrice1+totalPrice2+totalPrice3;

        String report = "";
        if(count1 ==0){
            report= "Item2: "+item2+ "Price: "+price2*count2+","+"Item3: "+item3+" "+"Price" +price3*count3;
            //System.out.println("Total price: "+total);
        }  else if(count2==0){
        report="Item1: "+item1+" "+"Price: "+price1*count1+","+" Item3: "+item3+" "+
                "Price: "+price3*count3;
    }else if(count3==0){
        report="Item1: "+item1+" "+"Price: "+price1*count1+","+" Item2: "+item2+" "+
                "Price: "+price2*count2;
    }
     System.out.println(report);
     System.out.println("Total price: "+total);












    }
}
