package Office_hours.Practice_04_22_2020;

public class methodOverloading {
    public static void main(String[] args) {
        method1(10);
        method1(10.90);
        method1(10,34);

    }
    public static int  method1(int a){
       return 123;
    } public static double method1(double a){
        return 456.9;

    } public static int  method1( int a,int b){
        return 789;// its executes current method

    }
}
