package day27_DateTime;

import java.time.LocalDate;
import java.util.SortedMap;

public class dates {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020,10,25);
        System.out.println(date1);
        LocalDate birthDate = LocalDate.of(1984, 7,22);
        System.out.println(birthDate);
        boolean result1 = date1.isAfter(birthDate);
        System.out.println(result1);
        boolean result2 = date1.isBefore(birthDate);
        System.out.println(result2);
        //isEqual
         boolean result3 = date1.isEqual(birthDate);
        System.out.println(result3);
        //isLeapYear ?
        boolean result4 =birthDate.isLeapYear();
        System.out.println(result4);
        System.out.println("================");

        LocalDate now = LocalDate.now();
        System.out.println("Today is "+now);
        // birthdays
         LocalDate birthday1 = LocalDate.of(1990,04,25);
         int month = birthday1.getMonthValue();
         LocalDate now1 = LocalDate.now();
         System.out.println(month+" "+now1);
       // converting toString method
        String str = now.toString();
        System.out.println(str.replace("-","*"));

    }

}
