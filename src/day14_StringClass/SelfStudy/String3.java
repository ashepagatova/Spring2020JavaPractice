package day14_StringClass.SelfStudy;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        System.out.println("Enter the word");
        String word =  s.next();
        String middChar = "";
        int totalNumber  = word.length();
        int midNumber = totalNumber/2;
        if(midNumber%2 !=0){
            middChar+=word.charAt(midNumber);
        }else{
            middChar+=word.charAt(midNumber-1)+""+word.charAt(midNumber);
        }
        System.out.println(middChar);






    }
}
