package onlyReplits;
import java.util.Scanner;
public class numpositive {
    public static void sign(int n) {
        //your code here
        if(n>0){
            System.out.println(n+" number is positive");
        } else if (n < 0) {
            System.out.println(n+" number is negative");
        }else{
            System.out.println(" number is zero");
        }



    }//end sign

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);
    }
}


