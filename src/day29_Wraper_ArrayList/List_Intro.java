package day29_Wraper_ArrayList;
import java.util.ArrayList; // you  import it
public class List_Intro {
    public static void main(String[] args) {

         ArrayList <Integer> score = new ArrayList<Integer>(); // we don't need initialize
        // auto adjusted
        //        date type mandatory         its optional
        // int arr[] = new int[3];

        score.add(10);// Autoboxing [10] size of array 1
        score.add(20); //Autoboxing [10,20] size of array 2
        score.add(30);

        System.out.println(score); // return [10]
        //get method you will pass your index number
        Integer n =  score.get(2); // none
        int a2 = score.get(2);// unboxing wraper class primitives
        double a3 = score.get(2);// unboxing

        System.out.println(a3);






    }
}
