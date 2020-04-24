package day21_MultidementialArray;

import java.text.DecimalFormat;

public class FormationgDecimals {
    public static void main(String[] args) {
       // DecimalFormat DF = new DecimalFormat();
      DecimalFormat DF1 = new DecimalFormat("0.00");

        double a = 10.0/3.0;

        System.out.println(DF1.format(a));

        System.out.println(DF1.format(2.3456789));


    }
}
