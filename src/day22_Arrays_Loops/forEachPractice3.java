package day22_Arrays_Loops;

public class forEachPractice3 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };
        int countOdd = 0;
        int sumOff=0;
       for(int []eachArr1:numbers){
       for(int eachArr2:eachArr1){
          if(eachArr2% 2==0){
              System.out.println(eachArr2);
          }else{
              countOdd++;
              }
           }
        }
        System.out.println();

    }
}
