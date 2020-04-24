package ayna_daily_traning_code;

public class maxNumber_practice {
    public static void main(String[] args) {
        /*
        accepts 3 number and return max number
         */

        double a =100;
        double b =200;
        double c = 300;


        boolean aGreater =a>b && a>b;// if a greater than b and c it should be maxim num;
        boolean bGreater = b>a && b>c;//means b greater num than a and c;
        boolean cGreater =c>a && c>b; //means c is greater b and a ;

///{{{{{this is we doing mix with boolean and declaring  if only without else or else if }}}}

        if(aGreater){
            System.out.println("A is greater");
        }if(bGreater){
            System.out.println("B is greater");
        }if(cGreater){
            System.out.println("C is greater");
        }

/*
       {{{{Part 1.This doing only with boolean expression}}}}

        boolean aGreater =a>b && a>b;// if a greater than b and c it should be maxim num;
        boolean bGreater = b>a && b>c;//means b greater num than a and c;
        boolean cGreater =c>a && c>b; //means c is greater b and a ;
        System.out.println("A greater");
        System.out.println("B is greater");
        System.out.println("C is greater");

       {{{ ^^^^This code will all exucuted so need create the if statement!!!}}}

       {{{{Part 2. this doing clearly with only with if and else id statements}}}
        if(a>b&&a>c){
            System.out.println("A is greater");
        }  else if(b>a && b>c){
            System.out.println("B is greater");
        }else if(c> a&&c>b){
            System.out.println("C is greater");
        }else{
            System.out.println("Invalid Entry");
        }
   {{{{{this is an other example just with is statment }}}}}

        */




    }
}
