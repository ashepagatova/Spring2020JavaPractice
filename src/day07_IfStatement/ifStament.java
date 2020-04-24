package day07_IfStatement;

public class ifStament {


        public static void main(String[] args) {
            int number = 100;
/*
                    if (number % 2 == 0) {
                        System.out.println(number + " is even number");

                    } if (number % 2!= 0){
            System.out.println(number + " is odd number");}

 */

            if(number %2 == 0){ //maybe
                System.out.println(number+ "is even number");
            } else { //otherwise
                System.out.println(number + " is odd number");

            }

            int age = 13;
            if(age>= 21){
                System.out.println(age+ " Here is your Vodka");
            } else{
                System.out.println(age + " Go drink your Milk ");
            }
            boolean testetPositive =true;
            //boolean testedNegative = false;
            if(testetPositive){
                System.out.println( " go emergency");
            } else{
                System.out.println(" do coding");
            }



        }

    }

/*1. A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a program that declares three integers as angles and check whether a triangle is valid or not.
	2. write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
	3. write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)
	4. write a java program that accepts three numbers and rteurn the mediam number
				(assume that none of them are equal)
	5. write a java program that can identify if a person is eligible to vote for Donald Trump



 */



