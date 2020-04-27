package day19_Array;

public class Interview_Question_Freaquency {
    public static void main(String[] args) {

        String str = "AABCC";//A2B2C2
        String result ="";
        String nonDublecate = "";
        for(int i = 0;i<str.length()-1;i++) {
            if(!nonDublecate.contains(""+str.charAt(i))){
                nonDublecate +=str.charAt(i);
            }

        }
        for (int j = 0;j<=nonDublecate.length()-1;j++) {
           char ch = nonDublecate.charAt(j);


            int conut = 0;// how many time the charakter occur in ther string
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == nonDublecate.charAt(j)) {
                    conut++;
                }
                result += "" + ch + conut;

            }
        }
        System.out.println(result);

        String str1 = "AABCC";     //"A2B1C2"
        String result1 = "";   //"A2B1C2"

        String nonDup =""; //ABC

        for(int i=0; i <= str1.length()-1; i++){

            if(!nonDup.contains( ""+str1.charAt(i)) ){  // if the character at index i is not contained in nonDup, then it will be concated
                nonDup += str1.charAt(i);
            }

        }

        System.out.println(nonDup);




        int count = 0;  // count the total number of occurence of each charcter from str

    }

}
