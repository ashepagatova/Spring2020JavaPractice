package ayna_daily_traning_code.practice_one;

public class StrigManipulation {
    public static void main(String[] args) {
        String str = "Cybertek";
     // charAt(ImdexNumber);
        char ch1 = str.charAt(5);
        System.out.println(ch1=='A'); // return false 't'=='A'
        System.out.println(ch1=='T'); // false case sensative

      ///length();
         int totalLenght = str.length()-1;
        System.out.println(totalLenght); //return 8
        System.out.println(totalLenght>10);// false


        String str2 = "Today is great day, Java is fun";
        int maxNum = str2.length()-1;// or double
        System.out.println(maxNum);

     //concat(Value);
         String s1 = "Cyberteck";
                 s1=s1.concat(" Scool");//we need assign the s1=s1.concat("value what ever we have")
        System.out.println(s1);
         String r1="Java is fun";
         r1= r1.concat(" and its easy");
        System.out.println(r1);

      //toLowerCase//

             String name1 = "CYBERTEK";
             name1=name1.toLowerCase();
             System.out.println(name1);
      //toUppercase();

        String name2= "cybertek";
        name2=name2.toUpperCase();
        System.out.println(name2);

        // trim();
        String a3 = "      LOve JavA  ";
        a3=a3.trim();
        System.out.println(a3);




























    }

}
