package day16_ForLoop;

public class contiePractice {
    public static void main(String[] args) {


        //String upperCase = " ";
       // String lowerCase = " ";
        for (char ch1 = 'Z'; ch1 >= 'A'; ch1--) {
           if(ch1=='Y'|| ch1=='H'||ch1=='J'||ch1=='D'){
            continue;
           }
            System.out.print(ch1+" ");
        }
        System.out.println();

        for(int i =1;i<=100;i++){
            if(i%3==0 ||i%5==0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
