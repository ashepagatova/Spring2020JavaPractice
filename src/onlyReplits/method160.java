package onlyReplits;

public class method160 {
    /*The danish prince most famous quote is "to be or not to be". that's a classic example of boolean logic.
    the hamletQuote method only returns true if one of  or both of the boolean parameters is true.
    example:
    hamletQuote(true, false)
    returns true
    hamletQuote(false,true)
    returns true
    hamletQuote(true,true)
    returns true
    hamletQuote(false,false)
    returns false

     */

    public static boolean hamletQuote(boolean toBe,boolean notToBe){
        boolean result = true;
        if( !(toBe || notToBe) ) {
            result = false;
        }

        return result;



    }public static void main(String[] args) {

        boolean n = hamletQuote(true,false);
        System.out.println(n);


    }
  }