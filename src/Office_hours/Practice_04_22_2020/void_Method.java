package Office_hours.Practice_04_22_2020;

public class void_Method {
    public static void main(String[] args) {

        System.out.println("hello batch 18");
        System.out.println("hello batch 18");
        System.out.println("hello batch 18");
        System.out.println("hello batch 18");
        System.out.println("hello batch 18");
        System.out.println("===============");


        print();
        System.out.println("================");
        boolean UScitizen = true;
        int age = 21;
        vote(age,UScitizen);
        //vote(21,true);// argument must match paramentre
        System.out.println("================");
        int yes  = 19;
        buyCigarette(yes);
        //buyCigarette(21); or you can pass an argument


    }
        public static void print(){     /* for(int i= 0; i< 5;i++){
            System.out.println("hello batch 18");
            }
          */
      //write a function than can identify that person can vote;


    }
        public static void vote(int age,boolean UScitizen){
                               // here int boolean is parameter
        boolean eligiable =age>=18 &&UScitizen == true;
        if(eligiable){
            System.out.println("You  are eligible to vote");
        } else{
            System.out.println("Your not eligible");
        }


    }
    public static void buyCigarette(int age) {
        boolean eligiableToBuy = age> 18 ;
         if(eligiableToBuy){
             System.out.println("You can buy cigarette");
         }else{
             System.out.println("You cannot buy cigarette");
         }
    }

}
