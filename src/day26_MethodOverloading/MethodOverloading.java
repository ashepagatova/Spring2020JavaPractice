package day26_MethodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {
        method(10); // original method
        method(10.0);
        //method name can be same just need be different parameter
    }
    public static void method(int a){ //parameter have to be different
        System.out.println("Original method");

    }
    public static void method(double b){ // you can gie different parameter or different dataType
        System.out.println("Overloaded method");

    }


}
