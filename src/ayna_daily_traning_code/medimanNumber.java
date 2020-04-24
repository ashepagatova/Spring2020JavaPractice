package ayna_daily_traning_code;

public class medimanNumber {
    public static void main(String[] args) {

// programm must return mediam number
        double a = 100;
        double b = 200;
        double c = 300;
        /*
        a: (a<b && a>c)  ||  (a>b && a<c);
        b: (b<c && b>a)  ||  (b>a && b<a);
        c: (c< b&& c>a)  ||  (c>b && c<a);

         */

        boolean aMed = (a<b && a>c)  ||  (a>b && a<c);
        boolean bMed = (b<c && b>a)  ||  (b>a && b<a);
        boolean cMed = (c< b&& c>a)  ||  (c>b && c<a);

        if(aMed){
            System.out.println(a+" A is Medium number");
        } if(bMed){
            System.out.println(b+" B is Medium number");
        } if(cMed){
            System.out.println(c+" C is Medium number");
        }


    }
}
