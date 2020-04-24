package day25_MethodRecap;

public class return_method {

    public static void main(String[] args) {
       int a = max(20,30);
        System.out.println(a);
       int  b = max(30,98);
        System.out.println(b);
    }
    public static int max(int num1, int num2){
         int max= 0;
        if(num1 >= num2){
            max = num1;
        }else{
            max = num2;
        }
        return max;
    }
    private static int max2(int num1, int num2){
        if(num1>= num2){
            return num1;
        }else {
            return num2;
        }
    }
}
