package day19_Array.SelfStudy;

public class FreeQvency {
    public static void main(String[] args) {

         String str = "AABBCCKKTSYSOOO";
         String  result = "";
         String nonDub = "";
        for (int i = 0; i <str.length() ; i++) {
            if(!nonDub.contains(""+str.charAt(i))){
                nonDub+=str.charAt(i);
            }


        }
       // System.out.println(nonDub);
        for (int i = 0; i <= nonDub.length()-1; i++) {
            char ch1 = nonDub.charAt(i);
             int count = 0;
            for (int j = 0; j <=str.length()-1 ; j++) {
                if(str.charAt(j) ==ch1){
                    count++;
                }
            }
            result+= ""+ ch1 + count;

        }
        System.out.println(result);

//
    }
}
