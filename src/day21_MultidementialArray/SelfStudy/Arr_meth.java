package day21_MultidementialArray.SelfStudy;

import java.util.Arrays;

public class Arr_meth {
    public static void main(String[] args) {
        String name = "Java i Love";
        char[] ch = name.toCharArray();
        System.out.println(Arrays.toString(ch));
        System.out.println("=========");
         String  atlar  = "i Love cooking";
         String [] sozler  = atlar.split(" ");
        System.out.println(Arrays.toString(sozler));


         String at = "California is best state";//
         String[] word = at.split(" ");
         String result = "";
           for (int i = word.length-1; i >=0; i--) {
            String eachWord = word[i];
               //System.out.print(eachWord+" ");
                result+=eachWord+" ";


        }
        System.out.println(result);


            String str1 = "AAATTAAPP";
            char []ch2 = str1.toCharArray();
           // String emp[] = str1.split("");
        System.out.println(Arrays.toString(ch2));


    }
}
