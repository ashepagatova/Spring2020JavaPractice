package day17_WhileLoop.SelfStudy;

public class factorialNum {
    public static void main(String[] args) {
// with while loop
     int num = 7;
     int  result  = 1;
     while (num>=1){
         result *=num;
          num--;
     }
        System.out.println(result);

        System.out.println("==============");
        // with for loop

        int result1 = 1;
        for (int i = 7; i >=1; i--) {
            result1*=i;
        }
        System.out.println(result1);
        System.out.println("=================");
        // with do while loop
        // int result2 = 1;
         int num2  = 7;
         int result2 = 1;
         do {

             //System.out.println(result2);
             result2 *=num2;
             num2--;


         }while (num2 >= 1 );

      System.out.println("Factorial number of  is "+result2);

    }
}
