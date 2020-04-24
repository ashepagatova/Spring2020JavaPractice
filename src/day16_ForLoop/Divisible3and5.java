package day16_ForLoop;

public class Divisible3and5 {

    public static void main(String[] args) {

//   1. write a program that can print all the ODD numbers between 1 ~ 100 that can be divisible by 3 & 5

      for(int i=1;i<100;i++){
       if(i % 2!=0){ //!=
           if(i%3 ==0 && i%5==0)
           System.out.print(i +" ");
       }
       }


// 2. write a program that can print all the EVEN numbers between 1 ~ 100 that can be divisible by 3 & 5


        for(int y=1;y<100;y++){
            if(y % 2==0){ //!=
                if(y%3 ==0 && y%5==0)
                    System.out.print(y +" ");
            }
        }




    }
}
