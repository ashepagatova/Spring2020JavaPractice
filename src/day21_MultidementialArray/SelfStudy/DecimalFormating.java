package day21_MultidementialArray.SelfStudy;

import java.text.DecimalFormat;

public class DecimalFormating {
    public static void main(String[] args) {
        DecimalFormat Name  = new DecimalFormat("0.00");
         double a = 10/3.0;
        System.out.println(Name.format(a));
    }
}
