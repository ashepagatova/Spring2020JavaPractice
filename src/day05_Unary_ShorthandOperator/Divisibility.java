package day05_Unary_ShorthandOperator;

public class Divisibility {
    public static void main(String[] args) {
//DataType VariableName =Data
        int number = 80;
        //if number divisible by 2 without any remainder
        boolean divisibleBy2 = number % 2==0;
        //if number divisible by 3 without any remainder
        boolean divisibleBy3 = number % 3==0;;
        //if number divisible by 3 without any remainde
        boolean divisibleBy5 = number % 5==0;


        String result1 =number+ " is divisible result " +divisibleBy2;// concatenation

        String result2 =number+ " is divisible result " +divisibleBy3;// concatenation

        String result3 =number+ " is divisible result " +divisibleBy5; // concatenation
                       /*
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

 */
        // you don't need multi line to get print statement

        String finalResult = result1 + " \n" + result2 + " \n" + result3; // your concatenating  with string so you can print one statement

        System.out.println(finalResult);

    }
}
         /* write a program that can check if a number is evenly divisible by 2, 3, 5,
            Ex:
                number = 65;  int
                divisibleBy2 =true/false  System.out.println(result1);
                divisibleBy3 =true/false
                divisibleBy5 =true/false

            output:



                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
                number = 80;  int
            output:
                80 is divisible by 2: true
                80 is divisible by 3: false
                80 is divisible by 5: true

*/
