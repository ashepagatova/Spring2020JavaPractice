package Office_hours.Practice_04_22_2020;

public class return_Statment {
    public static void main(String[] args) {
//        if(10>9){
//            return;
//        }
        method1();// it will be printed
        System.out.println("Hello batch 18");

    }
    public static void method1(){

        if(10>9) {
            return; // return statement executed method will be executed but main method will continue
           // System.exit(0); this will exist  entire program
        }
        System.out.println("Hello");// Hello  will not printed after return statement

    }
}
