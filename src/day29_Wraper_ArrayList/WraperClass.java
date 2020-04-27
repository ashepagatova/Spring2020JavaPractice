package day29_Wraper_ArrayList;

public class WraperClass {
    public static void main(String[] args) {

       int a =100;
       Integer b = 200;// primitive
       System.out.println(b+a); //wrapper class

       short s1 = 200; // you cannot accine to other primitives
       int n1 = s1; //you can only assign to the int
       Integer N1 = n1; // integer dedicated to the int

       int a1 = 20;
       float f1 = a1;
      // Float f2 =a1;  you cannot assign
       Integer I1 = 200;
       int  a2 = I1;

       Byte B1 = 126;
       int a3 = B1; // but primitives not loyal toto the wrapper class primitives
        //126 same value but data structure is different: one is wrapper class and one is primitive.






    }



}
