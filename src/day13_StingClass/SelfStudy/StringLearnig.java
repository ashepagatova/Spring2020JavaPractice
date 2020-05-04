package day13_StingClass.SelfStudy;

public class StringLearnig {
    public static void main(String[] args) {

     /*
         String str1 = " cat"; // initializing
         String str2 = new String("cat"); // initializing with new key work
         String s1 = "java";



    //char

     String name = "California";
     char ch = name.charAt(9);
     //length

     int n1 =name.length()-1;// return as int and its above than limit
     System.out.println(ch); //
     System.out.println(n1 > 250);

     //concat
     String  city  = "Pittsburgh"; //if we want to concat we can just re-asing
     city = city.concat(" is Great  city"); // here is great saple concat is same as +add+
     System.out.println(city);

     //toLowwerCase // toUppercase
      String  dog = "Reks";
      dog = dog.toLowerCase();
      System.out.println(dog);
      String cat  = "Arisha";
      cat = cat.toUpperCase();
      System.out.println(cat);

    // trim
    String state = "  New York  ";
    state = state.trim();
    System.out.println(state);

      */

//     String  school = " I love my State where i do live";
//     school= school.substring(0,8);// return given index and ending idex by cutting
//
//     System.out.println(school);// return  i LOVE
//
//     school= school.substring(11);// just cut  fist word and return rest
//
//     System.out.println(school);// return  State where i do live

     String  fullName = "Mary Turkmen";
                   //   01234567891011
     String firstName =  fullName.substring(0,4);
     String lastName =  fullName.substring(5,12);
     String hotmail = firstName+ "_"+lastName+"@hotmail.coom";
     System.out.println(hotmail);
     // replace(old, new)
      String cook = "I Love ear Palow and i can eat Palow almost every day";
      cook= cook.replace("Palow","Manty");
        System.out.println(cook);
        //replaceFirce
         String  baking = "I Love bake cakes and I can bake every day";
         baking = baking.replaceFirst("bake","boiling");
         System.out.println(baking);
         String boil = "Lets boil potato";
         boil = boil.replaceAll("Lets boil","We need");
         System.out.println(boil);
      //indexOf
        String boilWater = "Lets boil potato";
        int  int1 = boilWater.indexOf("b");
        System.out.println(int1);

        String potato = "Baked Potato";
        String baked =potato.substring(0,potato.indexOf(" "));
        String pot = potato.substring(potato.indexOf(" ")+1);
        System.out.println(baked);
        System.out.println(pot);




















    }
}
