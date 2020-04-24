package day21_MultidementialArray;

public class ScrumTeam {
    public static void main(String[] args) {
        String [] devTeam = {"Mary","Ahal","Lebap","Maru"};

        String [] testTeam = {"Dashoguz","Balkan","Merw"};
        String [] testers2 = {"Gokje","BayramAli","Anew"};

         String[] PO ={"Sakarchage","Garagum"};
        String [][] ScrumTeam ={devTeam,testTeam,PO};
                               // 0 , 1
        ScrumTeam[0][3] ="Turkmenbashy";
        ScrumTeam[1] = testers2;
        System.out.println(ScrumTeam[0][3]);

        String info = ScrumTeam[0][3];
        System.out.println(info);

         for (String EachEmployee :ScrumTeam[2]){
             System.out.println(EachEmployee);
         }
        System.out.println(ScrumTeam[2][1]);

        System.out.println("==========");





    }

}
