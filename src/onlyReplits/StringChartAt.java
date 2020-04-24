package onlyReplits;


import java.util.Scanner;
public class StringChartAt {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String txt = s.next();

        //your code here

        String res1 = txt.substring(0,1);
        String res2 =txt.substring(1,2);

        System.out.println(res1+res2);






    }
}
