package day21_MultidementialArray;

public class checkEmails {
    public static void main(String[] args) {
       /* Task:
        given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elemnts could be more in the array
        prin all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP

        */

        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};
        //String result = "";

        for(String EachEmail:emails) {
          /*  if(!EachEmail.endsWith("@gmail.com")){
                System.out.println(EachEmail);
            }
        }


           */
          if(EachEmail.endsWith("@gmail.com")){ // contains
              continue;
          }
            System.out.println(EachEmail);
        }

    }
}
