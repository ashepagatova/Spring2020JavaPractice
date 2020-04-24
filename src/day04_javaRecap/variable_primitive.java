package day04_javaRecap;

public class variable_primitive {


    public static void main(String[] args) {

        //DataType variableName = Data;

        byte num1 = 127;
        short num2 = num1;// double>float> int>short>byte
         //byte num3 =num2;
        int num4 = num2; // int is prefer by compiler;
        System.out.println("==============");
        long num5 = 123456789;
        float num6 =100L;
        System.out.println(num6);//100.0
        // 1.200,2.100 3.100.0
        float num7 =0.5F;
        System.out.println(num7);

        double num8 =0.5f;
        double num9=9999999L;// long but will print

        double num10 =100.5;
        System.out.println(num10);

        char ch1 ='$';
        System.out.println(ch1); // every single character corresponding number  print $

        char ch2 =22000; //65
        System.out.println(ch2);
         int a1 ='8';
        System.out.println(a1); //56 char 0-9 in character
        int a2 = 'z';
        System.out.println(a2); // 122
        double d1 ='z'+ '8'; //z 8? 178? 178.0
        System.out.println(d1);
        char ch4 = 'z'+ '8';
        System.out.println(ch4);

        boolean bool1 =true;
        boolean bool2 =  false;

        System.out.println(9>10); //false
        System.out.println(9>=9); //true
        System.out.println(9!=10);//true
        System.out.println("======");
        System.out.println('b'=='b');//true
        System.out.println('b'=='b'-1);//false
        System.out.println('a'=='a'); //'a' =="a precondition is not matching
        System.out.println('a' == 'b'-1); // true 97 ===98 =1
        System.out.println("Ayna" == "Bag Girl"); ///false
        System.out.println("Ayna"!= "Good Girl");  //true

        boolean r1 =!true; // false
        System.out.println(r1);
        System.out.println(!r1);

        System.out.println(!true==false); //true
        System.out.println(!true != !false);  //true









    }
}
