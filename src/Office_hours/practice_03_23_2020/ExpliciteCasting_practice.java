package Office_hours.practice_03_23_2020;

public class ExpliciteCasting_practice {
    public static void main(String[] args) {


         byte bnum = 100;
         short snum = bnum; // implicit casting


        int iNut = 200;
        short sNum =(short)iNut; // explicit

        float fNum = (float)0.5;
        System.out.println(fNum);


        float fNum2 =(long)0.5;
        //fNum2 =0;
        //fNUm2 = 0.0;

        System.out.println(fNum2);
        ///long int short byte => only accepts whole number
         long lNum1 = (long)4.5;
        System.out.println(lNum1);
              //4.5
        System.out.println(9/ (double)2); //4.5 //9/2=4
        System.out.println(10.0 /3);


    }
}
