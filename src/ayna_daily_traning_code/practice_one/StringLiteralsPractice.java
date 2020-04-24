package ayna_daily_traning_code.practice_one;

public class StringLiteralsPractice {
    // import jav.langString;not nessary all java.lang
    public static void main(String[] args) {
        String str1 ="cat";// String pool
        String  str2 = new String("cat");//Java heap independen object will be created
                               //constructor parameter name
        System.out.println(str1+":"+str2);

        System.out.println(str1==str2);//2 diffrent object
        String str3 ="cat";// string pool
        System.out.println(str1==str3); // true
        String str4 = new String("cat");
        System.out.println(str2==str4);


        String s1 = "Java";// string pool
        s1= "JavaScript" ;
        System.out.println(s1); // JavaScript
        String s2= "Java"; // no  new object will be created in memory
        System.out.println(s1==s2);





    }
}
