package day15_ForLoop.SelfStadyLoop;

public class Practice {
    public static void main(String[] args) {
        //1.forLoop repeated action
 /* for(int = initilization; condition :iterator){
          statement
 }
  */
 // you can give int,double or char
        for (int i = 0; i < 5 ; i++) { // if you give here = means 5 will included and will print 6
            System.out.println("hello");
        }
        for (char i = 'a'; i < 'z'; i++) {
            System.out.print("["+i+"]");
        }
        System.out.println();// breaking the line

        for(char i= 'z'; i>='a'; i--){ // here we give back so we need
            System.out.print("("+i+")"); //we return reverse order
        }
        System.out.println("====================");

        String  result = "";
        for (int i = 1; i < 100 ; i+=2) {
           // result = result + i+" ";
            result+= i+ "][";
           // System.out.print(i+ "][");
        }
       System.out.println(result);

        System.out.println("============================");

        String result2 = "";

        for (int num = 1; num < 49 ; num++) {
            result2+= num+"}{"; // concatination regular word we just adding to result

        }
        System.out.println(result2);

















    }
}
