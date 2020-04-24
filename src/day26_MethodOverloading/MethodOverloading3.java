package day26_MethodOverloading;

public class MethodOverloading3 {
    public static void main(String[] args) {
        sum(10,20);
        sum(1.2,20.9);
         double num1 = sum(10,2.3);
        System.out.println(num1);
        //
        double num2=sum(25L,45L);
        // void method donesnt return anything
        //double num3=sum(25,45); wrogn
        sum((int)40L,(int)50L);

    }

    public static void sum (int a,int b){
        System.out.println(a+b);

    }
    public static double sum  (double a,double b){ //paramentr is matters
        //System.out.println(a+b);
        // return doesn't have be same
        // in method overloading return type doesnt matter
        return a+b;


    }

}

