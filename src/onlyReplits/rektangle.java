package onlyReplits;

public class rektangle {
    public static void printHollowRect(){
        // write your code here:

// for(int i = 1;i<=5;i++){
//     for(int j = 1;j<=5;j++){
//
//     }
//
// }

        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i==2||i==3||i==4 )
                {
                    System.out.print("*   *");
                    break;
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }// end your code

    public static void main(String[] args) {

        printHollowRect();
    }


}
