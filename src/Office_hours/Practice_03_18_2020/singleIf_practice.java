package Office_hours.Practice_03_18_2020;

public class singleIf_practice {
    public static void main(String[] args) {

        int a = 200;
        int b = 200;
         boolean aGreader = a>b;
         boolean bGreader = b>a;
        // boolean  eEual = a==b;
       // boolean eQual = aGreader ==false && bGreader == false;
        boolean aEqual = aGreader ==bGreader;

        System.out.println(a+ " is greder number");

        if (aGreader){
            System.out.println(a+ " greader");
        } if (bGreader){
            System.out.println(b+ "greter ");
        }if(bGreader) {
            System.out.println(b + "is Equal");

        }
        System.out.println(a+ "is equal");



    }
}
