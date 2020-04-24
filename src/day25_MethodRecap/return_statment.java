package day25_MethodRecap;

public class return_statment {
    public static void main(String[] args) {
       /*
        if(10>9){
            return;// return exit's method quickly
        }
        System.out.println("Hello");// it will not print it

        */


       method1();
        System.out.println("hello");
         method2();
        System.out.println("yes");

    } public static void method1(){
         if(10>9){
             return; // if you returning something you can use it
             // if you not going return yes you can use
         }
        System.out.println("Hello cybertek");// will not printed
    }
    public static void method2(){
        if(10>9){
            System.exit(0);
        }
    }
}
