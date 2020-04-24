package day05_Unary_ShorthandOperator;

import com.sun.corba.se.impl.protocol.giopmsgheaders.LocateReplyMessage_1_0;

public class PrimitiveCasting {


    public static void main(String[] args) {

        //implicid casting are done automatically


        int a =10;
        long b =a; // implicit done automaticly
        // b = 10L

        // int c=b; // b is still long datatype dobnt need learning




        int a1 =100;
        long b1 =(long) a1;// implicit done by manually
        // but compiler doing it automaticly



// expricife

         int Inum =100;

         byte Bnum =(byte)Inum;

         short Snum = (short)Inum;

         double Dnum =5.5;
         float Fnum =(int) Dnum; // 5.5

        System.out.println(Fnum);
 double D1= 10.5;
 long L1 =(long)((float)D1);
        System.out.println(L1); //10

        float F1 =60.5f;
        int I1 = (int)F1; // prefered way
        System.out.println(I1);


        long largeNum =99999999999L;

        int intNum =(int)largeNum; // gives large num coz it rage 1215752191

        System.out.println(intNum);
// explisive it doesnt apply for char
        char ch1= 'a';
        short sh1 =(short)ch1;
        System.out.println(sh1);

        char chr2 = 23456;//0 to 65000
        //System.out.println(chr2);

        double dbl1= chr2;
        System.out.println(dbl1);
        int z1 =10;
        //double t1 =
               // (short)






    }
}
