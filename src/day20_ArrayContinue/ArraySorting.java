package day20_ArrayContinue;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[]  arr ={9,8,7,6,5,4,3,2,1,};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Fist minum Number is:"+ arr[0]);
        System.out.println("Second minimim Number:"+arr[1]);
        System.out.println("Fist max Number:"+arr[arr.length-1]);
        System.out.println("Second max Number:"+arr[arr.length-2]);

        char[] ch = {'W', 'D', 'A', 'G', 'O', 'E'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        String[] names ={"Mary","Ahal","Lebap","Balkan","Dashoguz"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int[]  arr2 ={3,1,4,-1,100, -100, 200, 155};

        Arrays.sort(arr2);

        int [] arrDec = new int[arr2.length];

        //System.out.println(Arrays.toString(arr2));
        int j= 0;

        for (int i  = arr.length-1; i<0;i--){
            //System.out.println(Arrays.toString(arr2));
       arrDec[j] = arr2[i];
       j++;
        }
        System.out.println(Arrays.toString(arrDec));
/*
        int[] arr = {3,1,4,-1,100, -100, 200, 155};3,1,4,-1,100, -100, 200, 155
            Arrays.sort(arr);

            int[] arrDesc = new int[arr.length];

        System.out.println(Arrays.toString(arr));

        int j = 0;

        for(int i = arr.length -1;  i >= 0; i--){
           // System.out.print( arr[i] +" ");
            arrDesc[j]  = arr[i];

            j++;
        }


        System.out.println(Arrays.toString(arrDesc));


 */
    }
}
