package day10_Switch_Scaner;


import java.sql.SQLOutput;
import java.util.Scanner;

public class ScanerClass {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a byte number");
    byte num1 = input.nextByte();

    System.out.println("Yo haved entred "+num1);

    if (num1 % 2 ==0){
     System.out.println(num1 + " Is even Num");
 }  else {
     System.out.println(num1+ "Is Odd number ");
 } }}

