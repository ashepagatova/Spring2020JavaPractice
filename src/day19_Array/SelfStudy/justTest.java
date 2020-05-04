package day19_Array.SelfStudy;

import java.util.Scanner;

public class justTest {
    public static void main(String[] args) {

        String month[] = {"Jan","Feb","March","April","May","June","July","August","September","October","November","December"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name:");
        int num = input.nextInt();

       while(num > 12 || num <=0) {
            System.out.println("invalid Entry");
           System.out.println("please re enter");
           num = input.nextInt();






        }
        String result = month[num - 1];
        System.out.println(result);


    }

















}
