package day05_Unary_ShorthandOperator;

public class unery_Operator {
    public static void main(String[] args) {

        int  a = 10;//possitive num  10
        int b = +a; //positive num 10


        System.out.println(a);
        System.out.println(b);
         int a2 =-10;
         boolean result1 = a2>0;//false
         boolean result2 = a2<0;// true
        System.out.println(result1);
        System.out.println(result2);

        int x1 =-10;
        int y1 = -x1;
        //-(-10) ==> +10
        System.out.println(y1);// 10 if you multiply 2 negative it  gives negative

        int x2 =+20;
        int y2 =x2;
        //-(+20) ==> =20

        System.out.println(y2);

        int x3 =  +20;
        int y3 =x3;
        //+ (20)


        //pre increment increse immidleatly
        System.out.println(y3);// return  positive
         int Z = 100;
        System.out.println(++Z);// increse value of variable by 1
        System.out.println(Z);


        //post increment incrise after after value

        int P =100;
        System.out.println(P++);// fist  passes current value
        System.out.println(P);














    }



}
