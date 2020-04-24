package day07_IfStatement;

public class MinimumNumber {
    public static void main(String[] args) {
        //3. write a java program that accepts three numbers and return
        // the minimum number (assume that none of them are equal);

        double a = 100;
        double b = 200;
        double c =300;
        boolean minimumA = a<b && a<c;// if a less than b and c then A min num
        boolean minimumB = b<a && a<c;// if b less than a and c then B min num
        boolean minimumC = c<a && c<b;// if c less than a and b then C min num

          if(minimumA){
            System.out.println(a+" A is minimum is");
        } if(minimumB){
            System.out.println(b+" B is minimum");
        } if(minimumC){
            System.out.println(c+" C is minimum");
        }


    }
}
