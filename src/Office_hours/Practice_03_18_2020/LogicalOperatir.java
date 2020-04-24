package Office_hours.Practice_03_18_2020;

public class LogicalOperatir {
    public static void main(String[] args) {
        // logical operator
        // || && !

        boolean ar1 = "Muhtar" == "Bad Guy"; //false

        System.out.println(ar1);

        boolean r2 = "Muhtar" != "Good God";//ture
        System.out.println(r2);
        boolean r3 = 10>=9;
        System.out.println(r3);// true
        boolean r4 = !false ==!true ;
        //trur == false == false
        System.out.println(r4);


        // || or logic as long as condition true it will return true

        boolean resutl1 = 9!=8 || 9 == 8;
                         //true || false
        System.out.println(resutl1);
        boolean result2 = 'a' == 'A' || 'A' =='b';
        // false ||false

        System.out.println(result2);
 boolean result3 =6>5 && 6<4;
        System.out.println(result3);

boolean result4 = !false != false && !true == false;
///true != false && false =false
         //


    }
}
