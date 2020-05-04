package day19_Array.SelfStudy;

public class Arrays_intro {
    public static void main(String[] args) {
        int [] name = {1,2,3,4,5,6,7,8}; // index number and declare in the []
       // int num= name[2];/// retrive
        for (int i = 0; i < name.length ; i++) {
        int str = name[i];
            System.out.print(str+" ");

        }

         String []emails ={"cybertek@yahoo.com","cybertek@gmail.com","cybertek@hotmail.com","cybertek@outlook.com"};
        for (int i = 0; i <emails.length ; i++) {
            String EMail = emails[i];
             if (EMail.endsWith("@hotmail.com")){
                 System.out.println(EMail);
             }
        }
        }
}
