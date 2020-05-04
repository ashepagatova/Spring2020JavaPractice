package day19_Array.SelfStudy;

public class Uniques {
    public static void main(String[] args) {

         String  men = "AAALLOP";
         String son = "";
          for(int i = 0; i <men.length();i++){
               int gosh = 0;
              for (int j = 0; j < men.length(); j++) {
                  if(men.charAt(j)==men.charAt(i)){
                     gosh++;
                  }
              }
              if(gosh==1){
                  son+=men.charAt(i);
              }
          }
        System.out.println(son);


    }

}
