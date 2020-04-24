package day26_MethodOverloading;

import java.util.Arrays;

public class MethodOverloading2 {
    public static void main(String[] args) {
        sum2OfNUmber(10,10);
        sumThreeNumber(20,90,90);
        sumFourNumber(30,40,40,40);
        int [] arr ={5,4,5,6,7,8,9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//=================================================
        sum(10,7);
        sum(10,23,45);
        sum(12,34,56,78);
    }
    public static void sum2OfNUmber (int a,int b){
    // or parameters name of the method  should be different or dataType(int double, String)
        System.out.println(a+b);

    }
    public static void sumThreeNumber(int a,int b, int c){
        System.out.println(a+b+c);
    }
    public static void sumFourNumber(int a,int b, int c,int d){
        System.out.println(a+b+c+d);
    }
    //====================================================
    public static void sum (int a,int b){
        System.out.println(a+b);

    }
    public static void sum  (int a,int b, int c){
        System.out.println(a+b+c);

    }
    public static void sum(int a,int b, int c,int d){
        System.out.println(a+b+c+d);
    }
}
