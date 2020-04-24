package Office_hours.Practice_04_15_2020;

import java.util.Arrays;

public class StringMethod {
    /*
    String method in Array
    toCharArray() returns CharArr
    split() splits
     */
    public static void main(String[] args) {
        String str = "Cybertek";
      // char[] ch = str.toCharArray();
       // System.out.println(str.length()==ch.length);
        /*
        str = "abd" str "cab"
         */
        String str1 ="acb";
        String str2 ="cab";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
         Arrays.sort(ch1);
         Arrays.sort(ch2);
        System.out.println(Arrays.equals(ch1,ch2));

        System.out.println("=====================");
         String sentance = "I like to learn java";
         String []words = sentance.split(" ");
         System.out.println(Arrays.toString(words));


         int total = words.length;
         System.out.println(total);

        System.out.println();
        String  result = "";
         for(int i= words.length-1;i>=0;i--){
             result +=words[i]+" ";
             //System.out.print(words[i]+" ");
         }
        System.out.println(result.trim());

    }
}
