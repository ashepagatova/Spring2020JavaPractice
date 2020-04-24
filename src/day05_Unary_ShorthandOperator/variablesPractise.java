package day05_Unary_ShorthandOperator;

public class variablesPractise {
    public static void main(String[] args) {  //variable you declari variable it call local variiable
        //whole number //byte short,int,long
        //decimal number;float doble
        int a1=100;

        float f1 =(long)a1;
        // f1=100L
        //100.0
        System.out.println(f1);
        long l1 =(long)f1;
        System.out.println(l1); //l1 = 100

        String name;
        //system.out.println; //local variable cannot be used without initialize
        name = "Cybertek"; //fisrt come first serve

        System.out.println(name);



    }
}
