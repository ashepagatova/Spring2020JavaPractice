package day20_ArrayContinue;



import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {


        //Arrays n = new Arrays(System.in);
        int[] arr = {1, 2, 3};
        String r = Arrays.toString(arr);
        System.out.println(r);
        System.out.println(arr);

        String names[]={"Mary","Ahal","Charjew","Balkan","Dashoguz"};
        System.out.println(Arrays.toString(names));

        double mary[]= {10,20,30,40,50,};
        System.out.println(Arrays.toString(mary));
        System.out.println(mary[0] +1 ); // if string will be comcat +1 but if num it wil does addition
    }
}
