package day14_StringClass;

import sun.tools.serialver.SerialVer;

public class practice {
    public static void main(String[] args) {
        String gmail = "cyberteckschool@gmail.com";
        String userinputGmail ="CebertekSchool@com";
        boolean result =gmail.equals(userinputGmail);
        if(result){
            System.out.println("Logged in");
        }

        String s1= "Cyberteck";
        boolean r1 = s1.contains("school");
        System.out.println(r1);
        //System.out.println(result);
        System.out.println("===============================");
        String  password = "nanan_80";
        if (password.contains(" ")){
            System.out.println("Password cannot contain space");
        }else{
            System.out.println("valid pasword");
        }
        String s3 = "United States";
        System.out.println(s3.startsWith("U"));

        String s4 = "Cybertek School";
        System.out.println(s4.endsWith("l"));
        System.out.println(s4.endsWith("School"));
        System.out.println(s4.endsWith("Cyberteck"));

        String webAdress = "www.amazon";
        webAdress= webAdress.toLowerCase();
        if(webAdress.startsWith("www.")){
            System.out.println("valid");
        }else{
            System.out.println("not ");
        }
        System.out.println("=================");
        String emailAdress = "Cyberteck@gmail.com";
        if(emailAdress.endsWith("gmail.com")) {
            System.out.println("valid adress");
        } else{
            System.out.println("not valid");
        }
    }
}
