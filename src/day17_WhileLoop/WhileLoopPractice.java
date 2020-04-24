package day17_WhileLoop;

public class WhileLoopPractice {
    public static void main(String[] args) {
        for (int i = 0;i<101;i++){
            System.out.print("*"+i);
        }
        System.out.println();

        int j = 0;
        while(j<101){
            System.out.print(" * ");
            j++;
        }
        System.out.println();



        int num = 3;
        System.out.println("***");
        while(num>0){

            System.out.println("* *");
            num--;
        }
        System.out.println("***");
    }
}
