package day11_Scanner;

public class browsers_switchSatament {
    /*
      3. write a program that can display the selected browser
                        1. declare a String variable called browserName

                        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                        3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
            Note: Do Not use scanner or if statement or ternary for this task    */
    public static void main(String[] args) {

        String browserName ="chrome";
           switch(browserName){
            case"chrome":// it wil not print but next case will get exucuted
            case "Chrome":
                System.out.println("Chrome is opening...");
                break;
            case"FireFox":
                System.out.println("FireFox is opening ....");
                break;
            case "Opera":
                System.out.println("Opera is opening...");
                break;
            case"Safari":
                System.out.println("Safari is opening...");
                break;

                default:
                    System.out.println("Invalid Browser name please give right browser name.");
                break;
        }

    }
}
