package day08_IfStatment;

public class DaysInmoth_multiBranchIf {


    public static void main(String[] args) {

        byte month = 11;

        String result = "";
        if(month == 1){
            result = "January has 31";
        } else if (month ==2) {
            result = "February has 28 or 29 days ";
        } else if(month ==4){
            result = "April has 30 days";
        }else if (month == 5) {

            result = "May has 31 days";
        } else if(month ==6){
            result = "June has 30 days";
        } else if (month== 7){
            result = "  July has 31 days";
        } else if (month==8){
            result= "August has 31 days";
        } else if (month ==9){
            result = "September has 30";

        } else if (month == 10){
            result = " October 31 days";
        } else if (month ==11){
            result = "Nobember has 30 days";
        } else if (month ==12) {

            result = " December is 31 days";
        } else {
            result = "Invalid Entry";
        }
        System.out.println(result);




    }
}
