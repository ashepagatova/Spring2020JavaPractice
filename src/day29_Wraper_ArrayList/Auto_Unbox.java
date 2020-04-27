package day29_Wraper_ArrayList;

public class Auto_Unbox {

    public static void main(String[] args) {

         int a = 100;
         Integer b =a;

         Byte byte1=98;

         short shor1 = byte1; // unboxing
         byte b2 = byte1; // unboxing
         int  n1 = byte1; //unboxing ;
        // converting primitive to wrapper class
        //converting wrapper class value to primitives


       String r1 = "true";
       Boolean t1 = Boolean.valueOf(r1);
       boolean t2 = Boolean.valueOf(r1);
       System.out.println(t1+ " " +t2);
       //
        System.out.println("=======");
        int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum);
        double minNum = Double.MAX_VALUE;
        System.out.println(minNum);



    }
}
