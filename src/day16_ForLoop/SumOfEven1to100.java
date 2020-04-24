package day16_ForLoop;

public class SumOfEven1to100 {
//    3. write a program that can calculate the sum of all the even numbers between 1 ~ 100
//  4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100;

    public static void main(String[] args) {
        int sum = 0;
        int sum3 = 0;
        for(int x= 0 ;x<=100;x++){
            if(x %2==0){
              sum +=x; // even number

            }else{
                sum3 +=x; // odd number
            }

        }
        System.out.println(sum);
        System.out.println(sum3);

        //  4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100;
        int sum2 = 0;
        for(int t= 0 ;t<=100;t++){
            if(t %2!=0){
                sum2 +=t;

            }

        }
        System.out.println(sum2);
}}
