package day10_Switch_Scaner;

public class switchstatement_practice3 {
    public static void main(String[] args) {


        char ch = 'A';
        String result = "";
        switch (ch) {
            case 'A':
                result = "A1";
               // System.out.println("A");
               // break;
            case 'B':
                result = "B1";
               // System.out.println("B");
                //break;
            case 'C':
                result = "C1";
                //System.out.println("C");
                //break;

            case 'D':
                result = "D1";
               // System.out.println("D1");
               // break;
             default:
                 result = "Invalid for String";
               //System.out.println("Invalid");
              // break;
 // conclusion  Most cases you should have break statement,

 // if there is cases where that share the same code you wouldn’t need the break
        }
                System.out.println(ch);

    }
}