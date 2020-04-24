package day05_Unary_ShorthandOperator;

import java.util.logging.Level;

    public class LeapYear {
    public static void main(String[] args) {

    short year =2020;//variable name does not have  to be unique, if its divisible by 4 should if leap year
      // LeapYear: year % 4 == 0;
        //if returns true its Leap year if it return false it is ==> not Leap Year;

    boolean LeapYear = year % 4== 0;// if the year can divisible by 4 without any reminder ,then its leap year

     String result = year + " is leap: " +LeapYear;
       // System.out.println(year+ "is leap year: " + LeapYear);
     System.out.println(result); // this is reusable than the first option




    }
}
