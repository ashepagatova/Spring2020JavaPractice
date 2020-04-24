package ayna_daily_traning_code;
import java.util.Scanner;
public class Coffeine_calculation {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");

        int num = scan.nextInt();
        int overDose =10*1000/num;
        System.out.println("It would take about "+overDose+ " drinks for a lethal overdose.");



    }



}
