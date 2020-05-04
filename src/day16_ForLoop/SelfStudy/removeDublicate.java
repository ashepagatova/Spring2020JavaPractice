package day16_ForLoop.SelfStudy;

public class removeDublicate {
    public static void main(String[] args) {

        String  str = "fffhhhll";

        String result = "";// we stored all string

        for (int i = 0; i < str.length()-1; i++) {
            if(!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);

            }
        }
        System.out.println(result);








    }
}
