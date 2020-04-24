package ayna_daily_traning_code;

public class equalNumbers {
    public static void main(String[] args) {

       double num1 = 100.9;
        double num2 = 200.9;
        double num3 = 200.9;

    boolean n1Equaln2 = num1 == num2 &&num1!=num3;// if num1 equal to num2 and doesnt equa

    boolean n1Equaln3 = num1 == num3 && num1 != num3;// only num1 equal num2 but not equal to num3

    boolean n2Equaln3 = num2 ==num3 &&num2 !=num1;// only n1 equal to n3

    boolean allEqual = num1 == num2 && num1 == num2;// all are equal


    boolean nonOfthemEqual =num1!= num2 && num1!= num3 &&num2!= num3;

//    boolean noneEqulal = n11Equaln2= false &&n1Equaln3== false && n2Equaln3== false;
//
//    boolean noneEqulal2 = !n11Equaln2 &&!n1Equaln3 && !n2Equaln3;
//
 if(n1Equaln2){
     System.out.println(num1+" Equal"+num2);
 } if(n1Equaln3){
            System.out.println(num1+" is Equal"+num3);
 }if(n2Equaln3){
            System.out.println(num2+" is Equal"+num3);
 } if(allEqual) {
            System.out.println(allEqual + " All of them are Equal");
 }if(nonOfthemEqual){
  System.out.println("None of them is Equal");
 }
 //else{
  //      System.out.println("None Of them are equal");
// }










       /*String total= "";

        if(num1==num2 && num1 !=num3){
            total = num1+ "num 1 is equal to num2"+num2;

        }else if (num1 == num3 && num2 != num3){

            total = num2+" num2 is equl to  num3"+num3;
        } else if(num3 == num1 && num3 == num1){
            total= num3+" num3 is equal to num2" +num2;
        }else{
            total = "non of them above is equal";
        }
        System.out.println(total);
*/
    }
}
