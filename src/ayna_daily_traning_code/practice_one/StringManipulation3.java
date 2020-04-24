package ayna_daily_traning_code.practice_one;

import sun.jvmstat.perfdata.monitor.AbstractPerfDataBufferPrologue;

public class StringManipulation3 {
    public static void main(String[] args) {
        String str = "I like java and I love ";
         int num1 = str.indexOf("j");
        System.out.println(num1);
         // if you ant find the lentgh
        int a1 ="Cybertek I love".length()-1;
        System.out.println(a1);
        String str2 = "my anme is Panda";
         int num2= str2.lastIndexOf("P");
        System.out.println(num2);

        //isEmpty;
        String str8= "";
        boolean emp = str8.isEmpty();
        System.out.println(emp);

        // isEqual();
        //equalsIgnore() case
        




    }

}
