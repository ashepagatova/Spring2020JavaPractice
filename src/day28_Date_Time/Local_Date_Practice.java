package day28_Date_Time;

import java.time.LocalDate;

public class Local_Date_Practice {
    public static void main(String[] args) {
       /* Warmup task:
        1. create an array of string, store five of your friends names in it
        2. create Array of localdates and store thier birthdays in the same order
        3. use for loop to print out your friends' names and thier birthdays

        */
       String [] friends = {"John","Aron","Daniel"};
        LocalDate JonhBirthday = LocalDate.of(2020,3,5);
        LocalDate AronBirthday = LocalDate.of(2000,10,12);
        LocalDate DanielBirthday =LocalDate.of(2010,5,6);
        LocalDate[] Birthdays = {JonhBirthday,AronBirthday,DanielBirthday};
        for(int i = 0;i<friends.length;i++){
            String name = friends[i];
            LocalDate  birthday = Birthdays[i];
            System.out.println();
        }

/* int a = 100;
 int b = 200;
 int c = 300;
 int[] array1 ={1,2,3};

 */




    }
}
