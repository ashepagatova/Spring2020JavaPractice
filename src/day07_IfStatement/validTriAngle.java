package day07_IfStatement;

public class validTriAngle {

    public static void main(String[] args) {
        // 1. A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a program that declares three
        // integers as angles and check whether a triangle is valid or not.
        short angel1 = 30;
        short angle2 = 50;
        short angle3 = 60;
        int sumOgAngles = angel1 + angle2 + angle3; // int can use indet boolean declare it
        boolean validTriangle = sumOgAngles == 180;
        if (validTriangle) {
            System.out.println(" all the three angles is equal to 180 degrees");
        }
        if (!validTriangle) {
            System.out.println("is not  equal to 180 degrees");
        }
        //2. write a java program that accepts three numbers and return the maximum number


    }

}
