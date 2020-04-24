package day20_ArrayContinue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_Chars {
    public static void main(String[] args) {
        String  name = "Ayna";
         char[] ch = name.toCharArray();
        System.out.println(Arrays.toString(ch));

        String str = "Cybertek School";
        String str1 ="School Cybertek";
        char[] ch1 = str.toCharArray();
        char[] ch2 = str1.toCharArray();
         Arrays.sort(ch1);
         Arrays.sort(ch2);
        boolean equl = Arrays.equals(ch1,ch2);

//        System.out.println(Arrays.toString(ch1));
//        System.out.println(Arrays.toString(ch2));
        System.out.println(equl);

    }
}
