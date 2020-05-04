package Day31_BulkOperators;

import java.util.ArrayList;
import java.util.Arrays;

public class Quize {
    public static void main(String[] args) {
        ArrayList<String>list= new ArrayList<>();
        list.add("Robb");
        list.add("Brain");
        list.add("Rick");
        list.add("Brain");
        if(list.remove("Brain")){
            list.remove("John");
        }

        System.out.println(list);
    }

}
