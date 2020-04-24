package Office_hours.Practice_04_15_2020;

import java.util.Arrays;

public class SingleArray {


    public static void main(String[] args) {
        int a = 100;
        // 0,1,2
        int arr[]= {100,200,300};
         //every array have index number starts from 0
        System.out.println(arr[1]);
        for (int i = 0;i<3;i++) { // index number each of the element
            int num = arr[i];
            System.out.println(num);
        }
            System.out.println("=======");
             int j = 0;
              while(j<3){
                  int num = arr[j];
                  System.out.println(num);
                   j++;

              }
             System.out.println("============");

              String [] names = {"John","Aaron","Luoise"};
              int length =names.length;
              String[] namesRevers = new String[length];//{null null null}
       /* //           i          k
         namesRevers[0] = names[2];
         namesRevers[1] = names[1];
         namesRevers[2] = names[0];
        System.out.println(Arrays.toString(namesRevers));*/
        /*int k = 2;
        for (int i= 0;i<length;i++){
            namesRevers[i]= names[k];
            k--;
        }
*/
        int i = 0;
        int k = length-1; // max index number
        while(i< length){
            namesRevers[i]= names[k];
            i++;
            k--;
        }
        System.out.println(Arrays.toString(namesRevers));

    }
}
