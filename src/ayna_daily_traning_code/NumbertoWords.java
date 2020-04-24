package ayna_daily_traning_code;
/**/
import java.util.Scanner;

public class NumbertoWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number beetween 0~9;");
        int num  =scan.nextByte();
        String result= "";

        switch (num){
            case  1:
                result ="One";
                break;
            case  2:
                result ="Two";
                break;
                case  3:
                result ="Three";
                break;
                case  4:
                result ="Four";
                break;
                case  5:
                result ="Five";
                break;
                case  6:
                result ="Six";
                break;
                case  7:
                result ="Seven";
                break;
                case  8:
                result ="Eight";
                break;
                case  9:
                result ="Nine";
                break;
            default:
                result = "Invalid Entry";
                break;

        }
        System.out.println(result);
         // solution 2
        String result2 = (num==0 )?"Zero":(num==1)?"One":(num==2)?"Two":(num==3)?"Three":(num==4)?"Four":(num==5)?"Five":
                (num==6)?"Six":(num==7)?"Seven":(num==8)?"Eight":(num==9)?"Nine":"Invalid Entry";
        System.out.println(result2);



    }
}
