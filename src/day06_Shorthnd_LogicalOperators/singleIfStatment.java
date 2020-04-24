package day06_Shorthnd_LogicalOperators;

public class singleIfStatment {
    public static void main(String[] args) {

     boolean colddWeather =false;

     if (colddWeather){
         System.out.println("Wear your hat");    // if condition if true 
         System.out.println("Wear your jacket");



     }

         boolean coronaDetected = true;
     if(coronaDetected ){
         System.out.println("Buy toilet paper");
         System.out.println("Buy More water");
         System.out.println("Stay at home ");
         System.out.println("Do more java coding");
     }
     System.out.println("=========================================================");

      int a=101;
      boolean evenNumber = a% 2== 0;     //if number can divided by two without remeinder
      if (evenNumber){
      System.out.println(a +" is even number");
      }

      int b =109;
      boolean oddNumber = b % 2!= 0;
      if(oddNumber)  {
      System.out.println(a + " is odd number");


       if (!evenNumber) {

       System.out.println(a+ " is odd number ");
        }
            
      }


    }

    public static class arthmaticOperators {


        public static void main(String[] args) {

            System.out.println(5 + 4);
            System.out.println(10 - 2);
            System.out.println(10 * 3);
            System.out.println(10 / 2); // in math the denominator cannot be zero 0


            int result1 = 10 % 3; ///1
            double result2 = 11 % 3;
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(10 / 4.0);
            System.out.println(10.0 / 4);
            double d1 = 10.0 / 4; // you  need give a decimal otherwise compailer accepts as integer
            System.out.println(d1);
            double d2 = 10 / 4.0f;
            System.out.println(d2);


        }

    }
}
