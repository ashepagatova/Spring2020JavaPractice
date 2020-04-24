package day12_javaRecap;

public class Switch_practice {
    public static void main(String[] args) {
     String total = "";
      switch(3){
      case 1:
     total = "Case 1";
     break;
      case 2:
      total ="Case 2";
      break;
      case 3:
      total="Case 3";
       break;
       default:
       total= "Invalid";
       break; // you do not need give break statement but you can avoid logical error

         }
        System.out.println(total);

    }
}
