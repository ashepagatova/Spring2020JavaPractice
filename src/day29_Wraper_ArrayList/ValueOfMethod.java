package day29_Wraper_ArrayList;

public class ValueOfMethod {
    public static void main(String[] args) {
     String str  = "123";

     Integer a = Integer.valueOf(str);// this method will return wrapper class
     System.out.println(a);

     double b = Integer.valueOf(str);
     System.out.println(b+" return as double");

     String str1 = "15.5";
     double d1 = Double.parseDouble(str1);
     //double = double = non
     System.out.println(d1);
     double d2 = Double.valueOf(str1);
     //double = Double Wrapper
     System.out.println(d2);
     System.out.println(d1==d2);






    }
}
