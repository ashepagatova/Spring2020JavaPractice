package day10_Switch_Scaner;

public class numToWords {
    public static void main(String[] args) {

        //3. write a java program that can convert numbers between 0 ~ 9 to words,
        // if the number is greater than 9 or less than zero, out put should be "Invalid".
        //				DO NOT USE IF STATEMENTS

        char ch1 = 5;
        String result = "";
         result = (ch1 == 0) ? "A" :(ch1 ==1)? "B" :(ch1==2)? "C":(ch1==3)?
                 "D":(ch1==4)?"E":(ch1 ==5)?"F":(ch1==6)?"G":(ch1==7)?"H":
                 (ch1 ==8)?"J":(ch1 == 9)?"K" :"Invalid Entry";

         System.out.println(result);


      int num = 9;
      String  words = (num==0)? "Zero":(num==1)?"One": (num==2)?
              "Two":(num ==3)?"Three":(num ==4)?"Four":(num ==5)?
              "Five":(num==7)?"Seven": (num ==8)? "Eight":(num==9)?"Nine":"Invalid";

        System.out.println(words);



    }
}
