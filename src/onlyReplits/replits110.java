package onlyReplits;

import java.util.Scanner;

public class replits110 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();


        //your code here
        // In this problem you need to write a program that checks for the bigger of 3 numbers.
//
//                You are given 3 int variables: num1 , num3 and num3.
//
//        if num1 is biggest - output: "n1 is bigger"
//        if num2 is biggest - output: "n2 is bigger"
//        if num3 is biggest - output: "n3 is bigger"


      String biggest1 = (num1>num2&&num1>num3)?"n1 is bigger":(num2>num1&&num2>num3)?"n2 is bigger":(num3>num1&&num3>num2)?"n3 is bigger" :"invalid entry";
        System.out.println(biggest1);

                }
                }
