package day23_Methods;

public class Quize {
    public static void main(String[] args) {

            /*int x= 7;
            if(available(x)) {                // Line 1
                System.out.println("Java SE");
            }else {
                System.out.println("Java EE");
            }

        }
        public static boolean available(int x) {
            return x > 1 ? true : false;
        }

             */

        dosum( 10, 20 );
        dosum( 10.0, 20.0 );
    }



    public static void dosum(double x, double y) {
        System.out.println("double sum is "+(x+y));
    }

    public static void dosum(float x, float y) {
        System.out.println("float sum is "+(x+y));
    }

    public static void dosum(int x, int y) {
        System.out.println("int sum is "+(x+y));
    }


}
