package day17_WhileLoop;

public class palendromeTestWhileLoop {
    public static void main(String[] args) {


        String str = " Level";
        String reverseStr = "";
        int index = str.length() - 1;

        while (index >= 0) {
           reverseStr+= str.charAt(index);
            index--;

        }
        boolean palandrome =reverseStr.equalsIgnoreCase(str);
        System.out.println(palandrome);
    }

}
