package day05_Unary_ShorthandOperator;

public class PostPreIncrement {
    public static void main(String[] args) {

        //pre: in change the value imminently

        int a = 100;
        System.out.println(++a);// 100
        System.out.println(a);
        int b=100;
        System.out.println(--b);// 99

        //Post :first passes the current value,then
        // eventually change the variable value
         int A =100;
        System.out.println(A++);// A vale still 100
        System.out.println(A);

        int B= 100;
        System.out.println(B--);//100
        System.out.println(B);//99
        // post  and pre examples :

        int z =10;
         int x=++z;
        System.out.println(x);//immideatly 11
        System.out.println(z);
        int s =10;
        int f=s++;

        System.out.println(f);
        System.out.println(s);
        double t1 =3.5;
        double t2 =t1--;
        System.out.println(t2);  //3.5
        System.out.println(t1);   //2.5


        int num = 35;
        System.out.println(num++);  //35 //36
        System.out.println(num--); // 35 //36





        

        











    }
}
