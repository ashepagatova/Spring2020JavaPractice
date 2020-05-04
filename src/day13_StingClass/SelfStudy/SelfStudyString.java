package day13_StingClass.SelfStudy;

import java.util.Scanner;

public class SelfStudyString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number 0 ~ 5");
        byte num = s.nextByte();
        String result = "";
        switch (num) {
            case 0:
                result = "Zero";
                break;
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            default:
                result = "Invalid entry";


        }
        System.out.println(result);
        System.out.println("====");
     String result2 = (num == 0)?"Zero":
                      (num ==1)?"One":(num == 2)?"Two":
                     (num ==3)?"Three":(num == 4)?"Four":
                      (num == 5)?"Five":"Invalid Entry";
        System.out.println(result2);

    }
}
