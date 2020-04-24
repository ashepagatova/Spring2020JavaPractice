package day15_ForLoop;

public class ForloopReverseNumber {
    public static void main(String[] args) {
        String str= "Java is fun";
        //String reverse1 = "" + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);
        int lastIntexNum =str.length()-1;
        String verb = "";
         for (int i = lastIntexNum;i >=0;i--){
             verb += str.charAt(i);
         }
        System.out.println(verb);





    }
}
