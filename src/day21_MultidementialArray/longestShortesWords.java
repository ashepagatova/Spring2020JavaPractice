package day21_MultidementialArray;


public class longestShortesWords {
    public static void main(String[] args) {
        /*
        2. write a program that can return the logest string of text from an array
	3. write a program that can return the shortest string of text from an array
         */

        String[] names = {"Mary","Ahal","Charjew","Balkan","Dashoguz","Turkmenistan"};
        int maxLengthString =  names[0].length();
        int minLengthString =  names[0].length();
        String longestWord = "";
         String shortWord = "";

         for(int i = 0 ;i<names.length;i++) {

           if (names[i].length() > maxLengthString) {
                 maxLengthString = names[i].length();
                 longestWord = names[i];
             }
             if (names[i].length() < minLengthString) {
                 minLengthString = names[i].length();
                 shortWord = names[i];

             }}
             System.out.println(longestWord);
             System.out.println(shortWord);

// /if(names[i].length() > maxLengthString ){
//                 maxLengthString = names[i].length();
//                 longestWord = names[i];
//             }
//
//             if(names[i].length() < minLengthString){
//                 minLengthString = names[i].length();
//                 shortWord = names[i];
//             }
//
//



         }


}





