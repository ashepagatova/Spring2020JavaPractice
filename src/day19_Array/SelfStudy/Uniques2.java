package day19_Array.SelfStudy;

public class Uniques2 {
    public static void main(String[] args) {
        String str =  "AATTYPI";
         String  total = ""; // store  th unique charakter
        for (int i = 0; i <str.length() ; i++) {
            char ch1 = str.charAt(i);
            int count  = 0; // copunt th accurence of the carakter
            for (int j = 0; j <str.length() ; j++) {
                char ch2 = str.charAt(j);
                if (ch1==ch2){ // how many time  the charakter is acure
                    count++;

                }
            } if (count==1){ // if character j is unique it will be concat to the result
                total+=ch1;
            }
            
        }
        System.out.println(total);
    }
}
