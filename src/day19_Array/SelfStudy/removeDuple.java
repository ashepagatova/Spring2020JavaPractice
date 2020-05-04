package day19_Array.SelfStudy;

public class removeDuple {
    public static void main(String[] args) {
        String str = "AARRTTYY";
        String nonDub = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDub.contains(""+str.charAt(i))){// if charakter not contained in the string then will ass
                 nonDub+=str.charAt(i);

            }
        }
        System.out.println(nonDub);
    }
}
