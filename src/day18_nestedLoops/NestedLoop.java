package day18_nestedLoops;

public class NestedLoop {
    public static void main(String[] args) {
        for (int j = 9; j >= 1; j--){
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();

       }


        for (int j=1;j<=9;j++) {
            for (int i=1;i<=j;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int j=9;j>=1;j--) {
            for (int i = j; i >= 1; i--) {
                System.out.print("* ");
            }
            System.out.println();


        }}
}
