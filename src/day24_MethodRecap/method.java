package day24_MethodRecap;

public class method {
    public static void main(String[] args) {
       // Reverse("California");
   //String name = Reverse2("Cybertek");

    }
    public static void Reverse(String str){
        String Reverse = "";
        for(int i = str.length()-1;i>=0;i--){
           Reverse+= str.charAt(i);

        }
        System.out.print(Reverse);

    } public static void Reverse2(String str){
        String Reverse = "";
        for(int i = str.length()-1;i>=0;i--){
            Reverse+= str.charAt(i);

        }
       //return Reverse;
    }

}
