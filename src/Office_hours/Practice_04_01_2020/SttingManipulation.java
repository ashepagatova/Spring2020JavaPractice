package Office_hours.Practice_04_01_2020;

import com.sun.javaws.IconUtil;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class SttingManipulation {
    public static void main(String[] args) {

        String str1 ="Java ";
        char ch1=str1.charAt(3);
        System.out.println(ch1);

        char ch2 =str1.charAt(4);
        System.out.println(ch2);

        //length():returns the total number of chars,int;

        String str2= "Cybertek School"; //
        int total= str2.length();
        System.out.println(total);
        int maxIndexNum =str2.length()-1;
        char ch3 =str2.charAt(maxIndexNum);
        System.out.println(ch3);
        System.out.println("================");
        String str3 ="Cybertek";
              str3= str3.concat(" String");// we need reassign
        System.out.println(str3);

        String str4 =     "Java";
        str4 =        str4.concat(" its fun");
        System.out.println(str4);
        System.out.println("=================");
        // tolowerCase(); toUpperCase(); change the case of teh string
        // to upper or to lower cas return new string

        String str5 ="CYBERTEK";
        str5=       str5.toLowerCase();
        System.out.println(str5);
         // to Upper case
        System.out.println("===============");
         String str6 ="Java I love";
          str6=str6.toUpperCase();
        System.out.println(str6);

        System.out.println("============");
        // trim method, trim(); removes unused or white space from the string;

 String str7 ="       Cybertek school";
  str7=  str7.trim();// we assigning it

        System.out.println(str7);
        System.out.println(str7.length());

        System.out.println("=====================");
           String str8 ="      Ayna        1";
           str8= str8.trim();
        System.out.println(str8.length());
        System.out.println(str8);
        System.out.println("======================");
        //sunstrin(beginnig ending index of the string); // ending index  is excludet;

        String sentance="I Like To Learn Java";
        String word1 =sentance.substring(7,11+1);
        String word2 =sentance.substring(7,sentance.length());
        String word3 =sentance.substring(2,5+1);//2.6
        String word4 =sentance.substring(2,6)+sentance.substring(7,sentance.length());

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(word4);



        //substring(beginning index );

        String sentance2="I like to learn Java";
        sentance2=sentance2.substring(10);
        System.out.println(sentance2);
        String sentance3="Java";
        //////////////////0123
        sentance3=sentance3.substring(0,2);
        sentance3=sentance3.toLowerCase();


        // replace (old str,new str);// repalce all maching ones, returns new string
        String  jvs = " I Like C#, C# is cool";
       jvs= jvs.replace("C#","Java");
        System.out.println(jvs);


        // replaceFist(old str,new str)
     String str = "Java is fun, Java is good";
     str=str.replaceFirst("Java","C#");
        System.out.println(str);

        //indexOf();// return index of fist machig charakter and return as int
        String y1 = "Today W is Wednesday";
         int a1= y1.indexOf("W");
        System.out.println(a1);
        int a2 = y1.indexOf("Wed");
        System.out.println(a2);
// lastIndexOf(str); return last character last of index
         String y2 = "CyberTek School is Cool";
         int a3= y2.lastIndexOf("C");
        System.out.println(a3);




    }




}
