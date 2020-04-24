package day22_Arrays_Loops;

public class count_odd_even {
    public static void main(String[] args) {
        /*
         4. write a program that can count the even and odd number from an array of integers
                        MUST use for each loop
         */
        int arr[]= {1,2,3,4,5,6,7,8,9,10,11};

        int contOdd = 0;
        int countEven = 0;

//        int[] word = arr.split(" ");
        for(int each :arr) {
          /*if(each %2!=0) {
              contOdd++;
          }else{
              countEven++;
          }*/
          if(each %2==0){
              countEven++;
              continue;
          }
          contOdd++;
        }
        System.out.println(contOdd+" Odd Number");
        System.out.println(countEven+" Even Number");
    }
}
