package day19_Array;

public class arrays_intro {
    public static void main(String[] args) {
        /*
        int[] scores = {70,75,85,90,95,100};
        int i = scores[2];
        int j=scores[5];
        System.out.println(i);
        System.out.println(j);
        System.out.println();

         */

       // String[] names ={"turkmen","kazak","kirgyz","uygur","tatar"};

       /* String friends =names[4];
        System.out.println(friends);
        System.out.println(names[0]);

        */

        String[] friends = { "Kuzzat" , "Asiya" , "Saim" , "Akbar", "Marufjon", "Guljannat" , "Murodil"};
        //          0          1         2        3        4             5           6

        /*
        System.out.println(   friends[6]   );
              String s1 =    friends[2];
        System.out.println(s1);
         */

        for(int i = 0; i <= 6; i++){
            String name = friends[i];
            System.out.println(name);
        }

    }

    }

