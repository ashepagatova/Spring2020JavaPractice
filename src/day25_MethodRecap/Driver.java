package day25_MethodRecap;
public class Driver {
    public static void main(String[] args) {
     String str =   getDriverOne("chromE");
        System.out.println(str);
        String str2 = getDriver2("safari");
        System.out.println(str2);
         String str3 = getDriver3("opeRa");
        System.out.println(str3);

    }
     public  static  String  getDriverOne(String browserName) {
         String result = "";

       /* switch (browserName.toLowerCase()){ // remove case sensativiti

            case "chrome": result = "Chrome driver"; break;
            case "firefox": result ="Firefox driver"; break;
            case "id": result= "InternetExplorer driver"; break;
            case "safari": result = "Safari driver"; break;
            case "edge": result = "Edge driver"; break;
            case " opera": result ="Opera driver"; break;
            default: result =" Invalid Entry"; // you need give break no more code will get executed
              return  result;
              }

*/
         return  result;


     }
     public static String getDriver2 (String browserName){
        String result = "";
         browserName = browserName.toLowerCase();
        if(browserName.equalsIgnoreCase("chrome")){
            result="Chrome Driver";
        } else if(browserName.equalsIgnoreCase("opera")){
            result="Opera Driver";
        }else if(browserName.equalsIgnoreCase("firefox")){
            result= "FireFox Driver";
        }else if(browserName.equalsIgnoreCase("safari")){
            result= "Safari Driver";
        }else if(browserName.equalsIgnoreCase("edge")){
            result= "Edge Driver";
        }else{
            result= "Invalid Entry";
        }
        return result;
     }

     public static String getDriver3(String browserName){
     browserName = browserName.toLowerCase();
         String result = "";

         result = (browserName.equals("chrome"))?"Chrome Driver"
                 :(browserName.equals("opera"))?"Opera Driver"
                 :(browserName.equals("safari"))? "SafariDriver"
                 :(browserName.equals("edge"))?"Edge Drivers"
                 :(browserName.equals("safari"))?"Safari": "Invalid Entry";

         return result;
     }

 }
/*
1. write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "id", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above, the method should return "Invalid"
				APPLY SWITCH STATEMENTS
	2. do the first task with multi-branch if statement instead of switch statement
	3. do the first task with ternaries instead of switch statements
 */