package day28_Date_Time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Formating {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.of(16,30);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh/mm/ss/a");

        System.out.println(time1.format(dtf));
        LocalTime time2  = LocalTime.of(9,45,3);
        System.out.println(time2.format(dtf));


    }
}
