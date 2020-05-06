package day21_MultidementialArray.SelfStudy;

public class minAndMaxLength {
    public static void main(String[] args) {
        String[] name = {"Aylar","Merdan","Batyr","Bilbil","Arslan","Shatlylk","Sona"};
        int maxLength = name[0].length(); //we ading lenth of name
        int minLeng = name[0].length();
        String maxStr = "";
        String minStr = "";
        for (int i = 0; i < name.length ; i++) {
            if (name[i].length()>maxLength){
                maxLength=name[i].length();
                maxStr = name[i];
            } if(name[i].length()<minLeng){
                minLeng= name[i].length();
                minStr= name[i];
            }

        }
        System.out.println(maxStr);
        System.out.println(minStr);
    }
}
