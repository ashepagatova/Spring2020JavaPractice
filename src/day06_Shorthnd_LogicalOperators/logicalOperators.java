package day06_Shorthnd_LogicalOperators;

public class logicalOperators {
    public static void main(String[] args) {

        boolean  resutl1 =true;
        System.out.println(resutl1);//  false
         boolean result2 = (10+ 15>15);
          boolean result3 = !true == false;
          /////            false== true ===>false
        System.out.println(result3);


        boolean R1 = "Corona Virus" != "not the end of the world " && "Toilet Paper "  == "cure";

        boolean r2 = 10 > 15 && 15< 13;
                // false && false ==> false
        System.out.println(R1);/// false
        System.out.println(r2);
        boolean R3 ='a'=='b'-1 && 'b' +1 =='c';
        // 97 == 98 -1 && 98 +12 =99 ===>
        System.out.println(R3);


        boolean R4 = true != false || false == !true;
        // true = false = true

        System.out.println(R4);
         boolean R5 = true != false && false == !true;
         // true && false = false
      boolean R6 = !!!false;
       ////////////!!true
         /////////f!!alse
                // !true
                // if odd number will return true
        // if even number will return exacly what num




















    }
}
