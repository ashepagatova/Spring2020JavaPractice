package Office_hours.Practice_04_01_2020;

public class StringMethod2 {
    public static void main(String[] args) {
        //relates to boolean
        //isEmpty();check if String is empty;
        String str1 ="     ";
        boolean r1 =str1.isEmpty();
        boolean r2 =!str1.isEmpty(); // lenght == 0
        System.out.println(r1);
        System.out.println(r2);
        // equal() check if 2 string empty or not
        String s1 = "cat";
        String s2=new String("cat");
        String s3 ="Cat";
        System.out.println(s1==s2); //we should always use == method
        System.out.println(s1.equals((s2))); //true
        System.out.println(s3.equals(s1)); //false,case sensativity
        System.out.println(s3.equalsIgnoreCase(s1));// ignores case sensativity
        System.out.println("==============");

        //containes(str); if included in the string and always return true or false;

        String sentance = "I like to Learn Java";
        System.out.println(sentance.contains("Java"));
        String sentance2 = "Top 3 virus: 1.Corona, Hanta,Ebola.";
        System.out.println(sentance2.contains("Java"));

        System.out.println("============================");
        //starts (str): checks is string startes with given str
        //endsswith
        String webAddress ="www.amazon.com";
        System.out.println(webAddress.startsWith("www"));// true
          String sunRise="sun rise from leftto right";
        System.out.println(sunRise.endsWith("right"));// true




    }
}
