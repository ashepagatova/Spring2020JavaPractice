package day07_IfStatement;

public class  mediumNumber {
    public static void main(String[] args) {
        //4. write a java program that accepts three numbers
        // and return the medium number
               // (assume that none of them are equal)
         double a = 100;
         double b = 200;
         double c = 300;
          /*
                 a: if  (a < b  &&  a > c)  or ( a >b && a < c)
                 b: if ( b < c && b > a )  or ( b > c && b < a)
                 c: if ( c < b && c > a ) or (c > b && c < a)

               */
         boolean medNumA = (a <b && a>c) || (a > b && a<c);
          // b < a < c    or   c < a < b
         boolean medNumB = (b<c && b>a) ||(b>c && b< a);
          // c < b < a  or  a < b < c
         boolean medNumC = (c<b && c>a) || (c>b && c<a);
          // c < b < a  or  a < b < c

         if(medNumA){
             System.out.println(a + " its is Medium Num");
         } if (medNumB){
            System.out.println(b + " it is medium Num");

        } if(medNumC){
            System.out.println(c + " it is medium Num");
        }










    }
}
