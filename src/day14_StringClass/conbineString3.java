package day14_StringClass;

import java.util.Scanner;

public class conbineString3 {
    public static void main(String[] args) {
/*
3. Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph

 */

        Scanner input = new Scanner(System.in); // creating object scanner

        System.out.println("Enter your word");
        String word = input.next();  // elephant
        //  01234567

        String middleCharacter = "";  // to store the middle characters at the end

        int totalChars  =  word.length();  //8
        int middleNumber = totalChars/2; // 8/2 = 4

        if(totalChars % 2 != 0){ // odd numbers

            // middleCharacter += word.charAt( middleNumber );
            middleCharacter = middleCharacter + word.charAt( middleNumber );

        }else{  // even number
             middleCharacter = middleCharacter + word.charAt(middleNumber -1)+word.charAt( middleNumber );

            //middleCharacter +=  word.charAt(middleNumber - 1)+"" + word.charAt(middleNumber);
            /// any thing we added to a string will return it as string

        }

        System.out.println(middleCharacter);


    }
}
