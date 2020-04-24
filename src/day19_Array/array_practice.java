package day19_Array;

public class array_practice {

    public static void main(String[] args) {

        String[] city = {"Mary", "Ahal", "Charjew", "Dashoguz", "Balkan"};

        for (int i = 0; i <= 6; i++) {
            String name = city[i];
            System.out.println(name);
        }
        String[] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};


        for (int i = 0; i <= 3; i++) {
            String email = emails[i];
            if (email.endsWith("@gmail.com")) {
                System.out.println(email);
            }

        }

    }
}