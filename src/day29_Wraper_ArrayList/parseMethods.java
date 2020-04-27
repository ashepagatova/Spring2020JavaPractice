package day29_Wraper_ArrayList;

public class parseMethods {
    public static void main(String[] args) {
        String str = "123";
        int a1 = Integer.parseInt(str);// converting string to the integer
        System.out.println(str+1); // test  "123" 1 = 1231
        System.out.println(a1+1); // number  123+1'

         byte b1 =Byte.parseByte(str);
         System.out.println(b1+5 ); // byte
      //  Integer I1 = Byte.parseByte(str); // doestn accepts
       Integer I1 = (int)Byte.parseByte(str);// its only for int  you casting to the int
       Integer I2 = Integer.parseInt(str);
       System.out.println(I2);

       String str1 = "10.5";

       double d1 = Double.parseDouble(str);
       System.out.println(d1+ 1);

       float f1 = Float.parseFloat(str1);
       System.out.println(f1+1);

      String str2 = "2147483647";
      long n1  = Long.parseLong(str2); //long 3147483647L
      //long  n1 = Integer.parseInt(str2);

      System.out.println(n1+2);
      Long  num2 = Long.parseLong(str2); //autoboxing
      System.out.println(num2+2);

      String result1 = "false"; // what ever by default it will return to you true or false
      //boolean a = true;

      boolean b2 = Boolean.parseBoolean(result1); //boolean
      System.out.println(!b2); // false
        // parse method is not case sensitive case about is meaning  of the word sure why not,.

      String str4  = "TRUE";
      boolean b3 = Boolean.parseBoolean(str4);
      System.out.println(b3); // they don't case the case sensitivity
      // wrapper class return primitive value

 // Any string that does not match "true"  will be returned false if we call the parse method from Boolean class
// Any string that matches "true", "TRUE", "TrUe", "truE", "tRue", etc..   will be returned true if we call the parse method from Boolean class






    }
}
