package ayna_daily_traning_code.practice_one;

public class Stringmanipulation2 {
    public static void main(String[] args) {

        /// substring
        String str="Cybertek is the best school";
                   //012345678910111213141516171819
         String school =str.substring(0,7+1);
        System.out.println(school);
         String fullname = "Kuzzat Altay";
       int l=fullname.length();
        System.out.println(l);

        String firstName =fullname.substring(0,6);
        String latName =fullname.substring(7,12);
        System.out.println(firstName);
        System.out.println(latName);
        // myssyjak+chishik@gmail.com
        String myssyk = "Myssykjak Chishik";
        String firstName1 = myssyk.substring(0,10);
        String lastrName2 =myssyk.substring(10,17);

        System.out.println(firstName1);
        System.out.println(lastrName2);
          String gmail = firstName1.concat("_")+lastrName2.concat("@gmail.com");
        String gmail2 =lastrName2.concat("_").concat(firstName1).concat("@gmail.com");
        System.out.println(gmail);
        System.out.println(gmail2);
        // substring second method just cut negining index
         String str1= "I want learn java and i love java";
        String className =str1.substring(7);
        System.out.println(className);

        //replace(old value, new value);
        String str3 = "I Love Love Love => Java, and I love C#";
        str3=str3.replace("Love","Like");
        System.out.println(str3);
         String nameOf = "Covid 18";
         nameOf= nameOf.replace("18","19");
        System.out.println(nameOf);
       //replaceFist();
         String myName="Pandajyk Shepagatova";
        myName= myName.replaceFirst("Pandajyk","Ayna");
        System.out.println(myName);












    }
}
