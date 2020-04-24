package day16_ForLoop;

public class continueStatment {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
        for(int e=1;e<=20;e++) {
            if (e % 2 != 0) {
                continue;
            }
            /*if(e%2==0){
                continue;
            }*/
            System.out.print(e+ " ");
        }
    }
}
