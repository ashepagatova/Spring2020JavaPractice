package Office_hours.Practice_04_15_2020;

import java.util.Arrays;

public class NestedLoop {
    public static void main(String[] args) {
        char [][] ch2D = {{'A','B'},{'C','D'},{'E','J','H'}};
        //ch2D
     // String  total = "";
        for(int j = 0; j<ch2D.length;j++){ // j represent names of 1D array
        for(int i = 0;i<ch2D[j].length;i++) { // i represent each elementArray
             //int total +=(ch2D[j][i]);
            //System.out.println(Arrays.deepToString(ch2D[j][i]));
        }
          // System.out.println(Arrays.deepToString(total);
        }
        for(char [] eachArr :ch2D){
          //  System.out.println(Arrays.toString(eachArr));
            for(char eachElm: eachArr){
                System.out.println(eachElm);
            }
        }

    }
}
