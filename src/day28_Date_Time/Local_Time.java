package day28_Date_Time;

import java.time.LocalDate;
import java.time.LocalTime;

public class Local_Time {
    public static void main(String[] args) {
        LocalTime  time = LocalTime.now();
        System.out.println(time);

        LocalTime time2 = LocalTime.of(2020,20,02);
        System.out.println(time2);
    }
}
