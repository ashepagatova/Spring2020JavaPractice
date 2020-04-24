package day09_NestedIf_Ternary;

public class withOutCurlyBraces {
    public static void main(String[] args) {

       /* int number= 100;

        if(number % 2 ==0){
            System.out.println("Even Number");

        } else{
            System.out.println("Odd Number");
        }
         if(true){ //9>8 it will exucuted  // 9<8 will
             System.out.println("Hello"); //if block contained more than one statement we must give the body

             System.out.println("Contie is true");
             System.out.println("Test exucuted");

*/

             double shoesPrice=1800;
             double discount= shoesPrice*20/100;
             boolean discount1= false;
             String result=" ";
             if (shoesPrice<2000 && shoesPrice>0) {
                 if (shoesPrice < 1500 && discount1){
                     result="She will use a credit card and buy a scarf";
                 } else if (shoesPrice>=1500 && discount1){
                     result = "She will use a credit card and buy a scarf";
                 } else {
                     result= "She will be sad";
                 }
             } else {
                 result="Too, expensive, I will buy from different brand";
             }
             System.out.println(result);




         }


    }
//}
