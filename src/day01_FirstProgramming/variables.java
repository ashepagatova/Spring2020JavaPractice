package day01_FirstProgramming;

public class variables {
    public static void main(String[] args) {

        /*
        DataType  variableName =Data;

         */

        byte l =4;
        byte w =2;
        byte area =8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);
          //byte num1 = 130  exceeds number of byte
         //short ;
        //byte num2 =2.5; byte,short,int,long they only accept whole number
        short num3 =1000;
        //short num4 = 40000; exceeds number of short
        System.out.println(num3);

        System.out.println(11111); // by default compiler takes it as int primitives

        int num5 = 1000000;
        long num6 = 10292029000l;// forcing compiler as int compiler recognize as int
        System.out.println(num6);
        //long n1=19;

        //int num=6L; large one caonnot be assign  to smaller one
         //byte b1= 10  short  large than byte small one cannot assign large but  large can assign to small
 //int i1= 10; cannot assign to large  but  but  large one can assign to small one
 //int =i1  = 01
        //System.out.println(10292029000l);
        System.out.println(3.4);
        double d1 =3.5; //
        //float f1 = 4.5; double primitives is larger that float primitives
  float f2 = 2.4f; // we can so no error F or f to compiler the variables
        System.out.println(f2);
        System.out.println("=====================================");


        float pi = 3.14f; // small primitive can  assiggne to larger
        double p = 3.14;

        int a1= 3000;
        double d2 = a1;
        System.out.println(d2);
 long  l2 =40;
float f3 =l2;
        System.out.println(l2);


    }




}
