package ayna_daily_traning_code;
import java.util.Scanner;
public class Scanner01 {
    public static void main(String[] args) {
        Scanner mirror = new Scanner(System.in);
        String result= "";

        System.out.println("Enter the number");
        byte num1=mirror.nextByte();
        result =  " Yo have entered this number "+num1;    // stored 12
                  if (num1 %2 ==0){
                      result= "Even number";
                  }else{
                      result="It is ODD number";
                  }



        System.out.println(result);








    }
                      

}
