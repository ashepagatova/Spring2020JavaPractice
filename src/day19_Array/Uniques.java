package day19_Array;

public class Uniques {
    public static void main(String[] args) {
        String str = "AABCC";
        String result = "";

        for (int j = 0; j <= str.length() - 1; j++){
            char ch2 =str.charAt(j);
            int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            char ch1 =str.charAt(i);
            if (ch1==ch2) {
                count++;
            }
        }
        if (count == 1) {
            result += ch2;
        }


    }


        System.out.println(result);



    }
}
