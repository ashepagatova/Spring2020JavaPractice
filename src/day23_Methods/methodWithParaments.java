package day23_Methods;

import java.util.Scanner;

public class methodWithParaments {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("emter you age");
         int age= scan.nextInt();

eligiableToBuyAlh(age );
    }

     public static void eligiableToBuyAlh(int age ){
        if(age>=21){
            System.out.println("Eligiable to buy Vodka");
        }else{
            System.out.println("you can buy a milk");
        }
     }

}
