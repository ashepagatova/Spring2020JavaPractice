package day23_Methods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class reverseString {
    public static void main(String[] args) {
        String name = "Java is fun";
        reverse(name);

        String name2 = "Cybertek School";
        reverse(name2);


    }
    public  static void reverse(String str){

         for (int i = str.length()-1;i>=0;i--){

             System.out.print(str.charAt(i));
         }
        System.out.println();

    }


}
