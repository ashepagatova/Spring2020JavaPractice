package ayna_daily_traning_code;
/*
findinf the min number
 */
public class minNumber {
    public static void main(String[] args) {

     double a = 100;
     double b = 200;
     double c =300.9;

     boolean aMin =(a<b &&a<b); // if a is less than e means   a is less  b and c 
     boolean bMin =(b<a && b<c);
     boolean cMin =(c<a&&c<b);
      
     if(aMin){
         System.out.println(a+"A is min Number");
     }if(bMin){
            System.out.println(b+"B is min number");
     }if(cMin){
            System.out.println(c+"C is min number");
            //System.out.println();  in here we adding a+ or b+ means it will return with number and statement
     }





    }


}
