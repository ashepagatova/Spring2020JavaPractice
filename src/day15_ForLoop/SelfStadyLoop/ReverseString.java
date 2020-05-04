package day15_ForLoop.SelfStadyLoop;

public class ReverseString {
    public static void main(String[] args) {

         String str = "Java";
         String  resverse = "";

       //1. int lastIndex = str.length()-1;
        for (int i = str.length()-1; i >=0; i--) { //you can do it in for loop
           // 1. System.out.println(str.charAt(i));
            resverse+= str.charAt(i); // adn here you adding
        }
        System.out.println(resverse);




    }
}
