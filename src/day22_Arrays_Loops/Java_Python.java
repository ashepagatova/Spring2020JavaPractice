package day22_Arrays_Loops;

public class Java_Python {
    public static void main(String[] args) {
        String sentance = "I like java and javascript python python";
         sentance= sentance.toLowerCase();
         int cont = 0;
         int countPython = 0;

       String[] word = sentance.split(" ");
           for(String each:word) {

           if (each.contains("java")) {
               cont++;
           }
           if (each.contains("python")) {
               countPython++;
           }
       }
           System.out.println(cont == countPython);

/*
 3. write a program that can return the number of appearances of
 "java" and "python" anywhere in the sentence
  (it's similar to the task 97 in repl.it, But this time you
  MUST use arrays and for each loop)
 */

    }
}
