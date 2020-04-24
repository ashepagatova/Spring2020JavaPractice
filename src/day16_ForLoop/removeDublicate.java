package day16_ForLoop;

public class removeDublicate {
    public static void main(String[] args) {
        String str ="ABBBHHHHHBBAKDJJJDLLLLD"; //absd
        String result = ""; //ab
         for(int i =0;i<= 20;i++){

             if(!result.contains( ""+str.charAt(i))  ){

                 result+=str.charAt(i);
             }
//
         }
        System.out.println(result);

//        String str1 = "AAAABBBBBCCCCDDDDDAAABBBBBCCC";
//
//
//        String result1 = "";  // "CD"
//
//        for(int i=0; i <= str.length()-1 ; i++){  // 0 , 1, 2 ,3
//            /*
//            if( !result.contains( ""+str.charAt(i)) ) {
//                result += str.charAt(i);
//            }
//             */
////
//            if(result1.contains( ""+str.charAt(i) )){
//                continue;
//            }
//
//            result1 += str.charAt(i);
//
//        }
//
//        System.out.println(result);
//


    }
}
