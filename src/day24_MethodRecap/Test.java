package day24_MethodRecap;

import java.util.Arrays;
import  Resourses.*;
public class Test {
    public static void main(String[] args) {
        String str = "Cybertek";
       String revStr= Library.Reverse(str);
        System.out.println(revStr);
        //String isPal =  palindrome.palindrome(str);
        System.out.println(str.equalsIgnoreCase(revStr));
         int[]arr = {12,345,567,3456,34,5634,5234,234};

       arr = Library.sortDesending(arr);
        System.out.println(Arrays.toString(arr));



    }
}
