package only_quize;

public class nightWarmups {
    public static void main(String[] args) {
       /* warm up tasks:
        1. write a method called KmToMiles that can convert km to miles
        1 km = 0.612 miles
        2. write a method called GalonsToLitters, that can convert gallons to litters
        1 G = 3.75 L
        3. write a method called Calculation, that can accepts 3 parameters: 2 numbers and one operator, and prints out the calculation
        if operator is not between [-, +, *, /, %] output should be Invalid Operator
        Ex: calculate(10, 2, "*") ==> 20;
        4. write a method called Grade, that can print out the grade based on the score of the student
        if score is 100 ~ 90 ==> A
        if score is 89 ~ 80 ==> B
        if score is 79 ~ 70 ==> C
        if score is 69 ~ 60 ==> D
        if score is 0 ~ 59 ==> F
        otherwise ==> Invalid Score
        Ex:
        Grade(100); ==> A
        Grade(120); ==> Invalid
        */

kmToMl(12);
galon(10);




    }
    public  static void kmToMl(double km) {
        //1 km = 0.612 miles

        double mile = km * 0.612;

        System.out.println(km + " is " + mile + " miles");

    }
    public  static  void galon(double  litre){
        //  1 G = 3.75 L
        double galon = litre*3.75;
        System.out.println(galon+" one gallon "+litre);
    }
    public static void calculator(int n1,int n2,String str){
        /*
        3. write a method called Calculation, that can accepts 3 parameters: 2 numbers and one operator, and prints out the calculation
        if operator is not between [-, +, *, /, %] output should be Invalid Operator
        Ex: calculate(10, 2, "*") ==> 20;
         */
        int result = 0;
        if(str.equals("-")){
            result = n1 - n2;
        }else if(str.equals("+")){
            result = n1+n2;
        }else if(str.equals("*")){
            result = n1*n2;
        }else if(str.equals("/")){
            result =n1/n2;

        }else if(str.equals("%")){
            result=n1%n2;
        } else {
            System.out.println("Invalid Entry");
        }
        System.out.println(result);



    }
}