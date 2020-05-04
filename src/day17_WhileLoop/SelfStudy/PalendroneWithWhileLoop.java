package day17_WhileLoop.SelfStudy;

public class PalendroneWithWhileLoop {

    public static void main(String[] args) {
          String str = "Turkmen";
          String reversse="";
          //int i = str.length()-1;
        int i = str.length()-1;
            while (i>=0){
                reversse+=str.charAt(i);
               i--;
            }
        System.out.println(reversse.equalsIgnoreCase(str));

        System.out.println("===============");

         String str1 = "TURkMEn".toLowerCase();
         String rev = "";
         int  k = str1.length()-1;
         do {
             rev+=str1.charAt(k);
             k--;
         }while (k>=0);
        System.out.println(rev);

       // System.out.println(rev.equalsIgnoreCase(str1));


    }
}
