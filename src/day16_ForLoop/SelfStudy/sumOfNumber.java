package day16_ForLoop.SelfStudy;

public class sumOfNumber {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 =0;
        for (int i = 1; i <100 ; i++) {
            if(i%2==0){
                sum1+=i;
            }else{
                sum2+=i;
            }
        }
        System.out.println("Even number"+sum1);
        System.out.println("Odd number"+sum2);
    }

    public static class traning {
        public static void main(String[] args) {
          /*  for(double i = 0; i<5;i++){
                System.out.println("P");
            }
            // with Char Reverse
            String  reverIt = "AynaS";
            String  r1 = ""+reverIt.charAt(4)+reverIt.charAt(3)+reverIt.charAt(2)+reverIt.charAt(1) +reverIt.charAt(0);
            System.out.println(r1);


           */

          String  reverse  = "Cybertek";  //int re =reverse.length()-1;
          String reV = reverse.substring(7)+reverse.substring(6,7)+ reverse.substring(5,6)+reverse.substring(4,5)+reverse.substring(3,4)+reverse.substring(2,3)
                  +reverse.substring(1,2)+reverse.substring(0,1);

          //System.out.println(re);
          System.out.println(reV);
           // String reverse2 = str.substring(3) + str.substring(2, 3) + str.substring(1, 2) + str.substring(0, 1);


        }
    }
}
