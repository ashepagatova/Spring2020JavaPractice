package day15_ForLoop.SelfStadyLoop;

public class palandrome {
    public static void main(String[] args) {
         String reverse = "";
         String  name = "leveL";
         for (int i = name.length()-1; i >=0; i--) {
            reverse+=name.charAt(i);
        }
        System.out.println(reverse); // level
        System.out.println(reverse.equalsIgnoreCase(name)); // return true

    }

}
