package Office_hours.Practice_04_22_2020;

public class return_Method {
    public static void main(String[] args) {
         sum(10,20);
        int num = sum2(10,40); // you can use num one in next code step

        System.out.println(num);
        System.out.println("==============");

        String name1= "Cybertek"; /* String reverse = "";
        for (int i = str.length()-1;i>=0;i--){
             reverse+=str.charAt(i);



        }
        System.out.println(reverse);

        */
        String name2 =reverseString(name1);
        System.out.println(name2);
        System.out.println(name1.equals(name2));


    } public static void sum(int a,int b){
        System.out.println(a+b); // if we dont need return anything we can use void


    }
    public static  int  sum2(int a, int b){

        return a+b; //we need give value to the return but that value will be reusable
    }
    public static  String reverseString(String  str){

        String result= "";
        for (int i = str.length()-1;i>=0;i--){
            result+=str.charAt(i);

        }
        return result;
    }

}
