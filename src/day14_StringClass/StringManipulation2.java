package day14_StringClass;

import java.sql.SQLOutput;

public class StringManipulation2 {
    public static void main(String[] args) {

        String str = " ";
        boolean bool1 = str.isEmpty();
        System.out.println(bool1); // return true or false

        String user = "";
        if(user.isEmpty()){
            System.out.println("provede the user name");
        }
         String s1 = "Cats"; // string litteratl
        String s2= new String("Cat");
        System.out.println(s1== s2);
        System.out.println(s1.equals(s2));


        String z1 = "Tiger";
        String z2 = new String("Tiger");
        String z3 = "Tiger";
         String  z4 = "Lion";
        System.out.println(z1==z2); //false different
        System.out.println(z2==z3);// false
        System.out.println(z1==z3);// false same object
        //equals();
        System.out.println(z1.equals(z2) );//true
        System.out.println(z2.equals(z3)); // true
        System.out.println(z1.equals(z3));//true when is text are not matching
        System.out.println(z3.equals(z4));




    }
}
