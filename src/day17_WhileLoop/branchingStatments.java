package day17_WhileLoop;

public class branchingStatments {

    public static void main(String[] args) {
        //System.exit(0); Stops entire program immidiatly

        for(int i =0;i<5;i++){
            if(i%2!=0){
                //break; // return 0 its exits loop
               // continue; //return 0,2,4
                //System.exit(0);
            }
            System.out.println(i);
        }
        System.out.println("Test complited");
    }
}
