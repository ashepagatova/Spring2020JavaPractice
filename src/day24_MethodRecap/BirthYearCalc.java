package day24_MethodRecap;

public class BirthYearCalc {
    public static void Age(int BirthYear) {
        int currentYear = 2020;
        int age = currentYear - BirthYear;

        if(BirthYear< currentYear&& BirthYear>1900){ // or 0
            System.out.println(age);
        }
        else{
            System.out.println("Invalid");
            System.out.println("Please Re-Enter ");
        }
    }


    public static void main(String[] args) {
        //int a = 1984;
       // Age(100);
        printCYbertekHello(); // hello Cybertek

}
    public static  void printHello(){
    System.out.println("Hello");
}
    public static  void printCYbertek(){
        System.out.println("Cybertek");
    }
    public static  void printCYbertekHello(){

       printHello(); //Hello
       printCYbertek();// Cybertek
    }
}
