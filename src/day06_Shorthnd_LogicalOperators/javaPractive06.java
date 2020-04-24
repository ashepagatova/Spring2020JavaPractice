package day06_Shorthnd_LogicalOperators;

public class javaPractive06 {
    public static void main(String[] args) {
//         byte voitingAge =18;
//         if(voitingAge >= 21){
//             System.out.println("Horrey  Your Elligble to vote");
//
//         } if (voitingAge <= 16){
//            System.out.println("No you cannot   Vote");
//        }
//

        int cyberTekExpence = 850; //monthly

        int  travelExpence =1000;

        int otherExpence =  5000; // monthly

        int  shoppingExpence =4900;

//         if(cyberTekExpence <= travelExpence){
//             System.out.println("  lets go travel");
//             if (otherExpence <=  shoppingExpence){
//                 System.out.println("we cannot  shop");
//             }
//
//
//         }
//

        if(cyberTekExpence > travelExpence  && otherExpence >= shoppingExpence){
            System.out.println("we can go travel");
            if  (  otherExpence  <= shoppingExpence ){
                System.out.println("We can go shopping");
            }

        }
       /* Create a double variable with the value 20
        2. Create a second variable of type double with the value 80
        3. Add both numbers up and multiply by 25
        4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        5. Print remaining total (#4) is equal to 20 or less : true/false

*/


    }
}
