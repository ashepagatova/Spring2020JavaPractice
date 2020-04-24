package day07_IfStatement;

public class MaximumNumber {
    //2. write a java program that accepts three numbers and return the maximum number
    public static void main(String[] args) {

        double a = 500;
        double b = 400;
        double c = 400;
        boolean aGreater = a>b && a>c; //if a grater than b and c than a is max number
        boolean bGreater =  b>a && b>c;// if b is grater than a and c mean b greater than
        boolean cGreter = c>a && c> b; //if c grater   number than a and b
       //
        if (aGreater){
        System.out.println(a+ "greater number ");
        } if (bGreater){
        System.out.println(b+ "greater number ");
        }if(cGreter){
        System.out.println(c+ "grater number");
        }

    }

}
