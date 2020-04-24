package Office_hours.Practice_03_18_2020;

public class shorthandOperator_practice {
    public static void main(String[] args) {
        //+=: addition assigment
        int a = 100;
        //a = a+100;
        //a= a+200;
        a+= 200;

        System.out.println(a); //a
        a +=200 *3;
        System.out.println(a); //900

//-=subtraction assignment
       //a=a - 400;
        a -= 400;
        System.out.println(a); // 500
         int b = 300;
         b-= 3 *40;
        System.out.println(b); //180

        //*= ; multiplication
         int x =5;
         //x= x * 3;;

        System.out.println(x);
        x *= 3; x*= 2+3; //x x * 3 ==> 45;
        System.out.println(x);

        //  /=; division assigment;
        int n = 900;
       // n =n/3;
        n /=3;
        System.out.println(n);
        n /= 3*5;
        System.out.println(n);


        ///%=: remainder assignment
        //remender : remander -(denominator* whole number  for result

        int m = 10;
        m=m %3/11;
        m %= 3; //m=1;
        System.out.println(m);
        int y = 300;
        y %= 3*5;
        //y%=15 ;++> y =y%15 ==> y+0;
        System.out.println(y);


        int t  = 400;
        t%= 10*2;
        //10 *2 =20
        // t%=20 ==> t = % 20; ==>t=0
        System.out.println(t);






    }
}
