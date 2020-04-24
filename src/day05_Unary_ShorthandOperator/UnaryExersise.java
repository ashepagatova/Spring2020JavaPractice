package day05_Unary_ShorthandOperator;

public class UnaryExersise {
    public static void main(String[] args) {

        int a = 50;
        a= --a + a++ + a-- + a++;
        //a = 49 +49 + 50 +   + 4
       //49+ 49+     50 + 49= 197
        System.out.println(a);


        int b = 1; //0 - +1
        b= -b-- + b++ / -b-- * --b;
        //b= -1 + 0 / -1 * -1;
        //-1 +) *-1
        //-1 +0 =-1
        //davidson fist
        System.out.println(b);

        int x = 10;
        int y= x++;
        System.out.println( y++ + " " +  x++ + " " + y);
                          //10 + 11 + 11

        int r = 5;
        r = --r + -r++ + r + ++r;
         // 4 + -4 + 5 + 6 = 11

        int k = 3;
        k = -k-- + -k++ / -k-- * ++k;
        //k = -3 + -2 / -3 * 3

        System.out.println("result  A"+0 + 1);
        System.out.println("result  B" + (1)+(2));
        System.out.println("5+2 = "+3+4);
        System.out.println("5+2 ="+(3+4));
        long n = 30l;
        long m =(short)n;
        System.out.println(m);
        // double z,o,c= 10.5;
        //System.out.println(o);

        float i = 100.987_6543f;
        short p =(byte)i;
        byte t =(byte)p;
        System.out.println(t);
        System.out.println ( 10/3 );


    }
}
