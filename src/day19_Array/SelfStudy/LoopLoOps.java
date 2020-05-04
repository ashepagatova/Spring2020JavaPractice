package day19_Array.SelfStudy;

public class LoopLoOps {
    public static void main(String[] args) {
         String   str = "AABBBCCFFOO";
          String result = "";

        for (int i = 0; i < str.length()-1 ; i++) {
             int count = 0;

            for (int j = 0; j < str.length()-1 ; j++) {
                 if(str.charAt(j)==str.charAt(i)){
                     count++;
                 }
            }
             if(count==1){
                result+= str.charAt(i);
             }


        }
        System.out.println(result);

    }
}
