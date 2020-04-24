package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dates_formating {
    public static void main(String[] args) {
        DateTimeFormatter  dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy"); //MMM it prints month name mm statnd for minutes
        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf)); //after declarinf just need past to print statement


        DateTimeFormatter  dtf2 = DateTimeFormatter.ofPattern("EEEE MMMM/dd/yyyy"); // for full month name //EEE stamd for days name
        LocalDate date2 = LocalDate.of(1984,07,22);//
        String str = date2.format(dtf2); // we can reuse later or if you dont want you can just  print out
        System.out.println("Happy Birthday "+str);


     
    }
}
