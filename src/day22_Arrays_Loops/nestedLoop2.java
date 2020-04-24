package day22_Arrays_Loops;

public class nestedLoop2 {
    public static void main(String[] args) {
        int [][] number = {{1,2,3},{4,5,6,7},{0,9,8,7,6,5}};
        /*number[0] = {1,2,3,4}
        number[1] ={2,3,3,3}
         number[2] ={2,3,3,3}
         */
        for(int i =0;i < number.length; i++){
            for(int j = 0; j< number[0].length;j++){

                System.out.print(number[i][j]);

            }
            System.out.println();
        }

       /* for(int k = number.length-1;k >= 0; k--){
            for(int l = 0; l< number[k].length;l++) {
                System.out.print(number[k][l]);

        */ for (int k = 0;k<number.length;k++){
            for(int i = number[k].length-1; i >=0;i--){
                System.out.print(number[k][i]+" ");
            }
        }
        System.out.println();
        for(int k = number.length-1;k>=0;k--){
            for(int i =0; i< number.length;i++ ){
                System.out.print(number[k][i]+" ");
        }}
        System.out.println();

        for(int k = number.length-1;k>=0;k--){
            for(int i =number.length-1; i>=0;i-- ){
                System.out.print(number[k][i]+" ");
        }}


   }
}
