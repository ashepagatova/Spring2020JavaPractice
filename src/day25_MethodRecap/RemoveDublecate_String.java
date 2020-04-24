package day25_MethodRecap;

public class RemoveDublecate_String {
    public static void main(String[] args) {
        String str = "ABABABABABA";
        String result = ""; //storing result of the loop
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains("" + ch)) { // this is char  so we need convert  comcating   to empty string
                // cheking if the  in result in contained the string if yes  so  wont  adding too the string if  yes i  wont adding to  the string
                result += ch;
            }
        }
        System.out.println(result);
        String str2 = "BACBACBACBA";
        String result2 = RemoveDublicates(str2);
        System.out.println(result2);
    }
        public static  String RemoveDublicates(String str) {
         //String str = "ABABABABABA";
         String result = ""; //storing result of the loop
         for (int i = 0; i < str.length(); i++) {
             char ch = str.charAt(i);
             if (!result.contains("" + ch)) { // this is char  so we need convert  comcating to empty string
                 result += ch;
             }

         }
        return  result;
     }
}
