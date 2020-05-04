package day14_StringClass.SelfStudy;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the word");
        String word = scan.next();

        String middChar = ""; // we store at the ennd characters
        int totalchar = word.length();
        int middNumber = totalchar/2;// number devid by 2
        if(totalchar%2!=0){  //odd number
            middChar+=word.charAt(middNumber);
        }else{
            middChar+=""+word.charAt(middNumber -1)+word.charAt(middNumber);// we need store string

        }
        System.out.println(middChar);





















    }
}
