package onlyReplits;
/*
Identify if triangle is valid or not with multi brach if only statement and other combination
 */
public class validTriAngle {

    public static void main(String[] args) {
   //validtriangle\\\

         int oneAngel = 30;
         int twoAngle = 50;
         int triAngle =100; // in total hava to 180;

         int sumOfAllAnhgle =(oneAngel+twoAngle+triAngle); ///(int) unless you casting /int

        // boolean validTriAngle = sumOfAllAnhgle == 180;// true or false //delete boolean forth senario

       // System.out.println("Shape is triangle"); // both condition is will be executed //fist scenario
      //System.out.println("Shape is not triAngle");//


        if(sumOfAllAnhgle ==180){ //validTriAngle
            System.out.println("The shape of TriAngle is True");
            // true will executed //executing of this fragment depend of if condition
            //exucution code gragment depend on condition
            }
         if(sumOfAllAnhgle !=180){ //!validTriAngle
        System.out.println("The shape is not valid"); //third scenario
        }

//        else{
//            System.out.println("This is not Valid tri Angle"); // second Scenario
//            }





    }
}
