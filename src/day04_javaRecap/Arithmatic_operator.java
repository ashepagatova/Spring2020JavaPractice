    package day04_javaRecap;

    import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

    public class Arithmatic_operator {
    public static void main(String[] args) {

        int a = 10/3 ;// 10/3==> 3.33333
        System.out.println(a);
        System.out.println(10/4); // 2
        // 10/2 == 2.5
        double d =10/4;
        //double d =2;
        //d==.2.0
        System.out.println(10/4); //2.0
        System.out.println(10.0/4); //2.5
        System.out.println(10/4.0);//2.5
        System.out.println(10.0 /4.0);// 2.5

        float f1 = 10/4;// number in in integer so that  will return in integer u need as f
        //float f1=2
        System.out.println(f1); //2.0
         //double num1 =5d

        boolean evenNumber = 25%2 ==0;
        System.out.println(evenNumber);// false
        System.out.println(25%2);// false
        boolean oddNUmber=22%2!=0; // odd number
        //0!= 0 = false

        System.out.println(oddNUmber); // false
        System.out.println(10%2==0); //is odd number
        System.out.println(11%2!=0);//11 is not odd number

        System.out.println("10 is even number  "+(10%2==0));

        System.out.println("10 is even number  "+(25%2!=0));//11

        System.out.println("25 is odd number "+(15%2 !=0) );

        System.out.println("25 is even number " +!(15%2 !=0));












    }
}
