package day14_StringClass;

public class webAdress_testing {
    public static void main(String[] args) {
        String website ="WWW.ceyberteck.com";
        website=website.toLowerCase();
 boolean validEnding = website.endsWith(".com")||website.endsWith(".net")||website.endsWith(".gov")||website.endsWith(".net");

        if(website.startsWith("www")&& validEnding){
            System.out.println("Valid wep page");
        }else{
            System.out.println("Invalid");
        }

    }
}
