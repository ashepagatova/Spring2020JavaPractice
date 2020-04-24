package day06_Shorthnd_LogicalOperators;

public class IfstatementPractice {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;
        //boolean bigOrsmallNum =

        if (a>b){
             System.out.println(a+ "is greater that "+b);
         }
         if (b>a){
             System.out.println(b+ " is greder than "+ a);
         }
         if (a==b) {
             System.out.println(a+ " is equal to "+b);
         }

         boolean bGreader = b>a;
         if(bGreader){
             System.out.println(a+ "is greater that "+b);

         }


        System.out.println("=========================================================");
        int x = 300;
        int y = 300;
        boolean xGreater = x > y;
        boolean yGreater = y > x;

        if(xGreater){
            System.out.println(x+" is gereater than "+y);
        }

        if(yGreater){
            System.out.println(y+" is greater than "+x);
        }

/*
        if(xGreater == false && yGreater == false){
            System.out.println(x+" is equal to "+y);
        }
*/

/*
        if(!xGreater  && !yGreater){
            System.out.println(x+" is equal to "+y);
        }
*/

        if(xGreater == yGreater){
            System.out.println(x+" is equal to "+y);
        }


        // 10,000,000
        int U = 10_000_000; // to increase the readability, similar function with comma in accounting


    }
}









