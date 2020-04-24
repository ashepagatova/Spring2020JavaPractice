package day07_IfStatement;

public class eligiableToVote {
    public static void main(String[] args) {

        int age = 18;
        boolean citizen = true;
        //boolean likeTrump =true;
        boolean eligible =age >=18 && citizen == true;
        if(eligible == true){
            System.out.println(age + " You can Vote");

        } if(eligible!= true){
            System.out.println(age + " You cannot  vote");
        }


    }
}
