package day15_ForLoop;

public class forLoop_practice {
    public static void main(String[] args) {

        String resultOdd = "";
          for(int i = 1;i<=101;i+=2){
              //System.out.print(i+" ");
              //System.out.println(i+""+(i %2==0)+ (i%2!=0));
              //result+= i+"";
              resultOdd = resultOdd + i+ " ";
          }
        System.out.print(resultOdd);

        String resultEven = "";
        for(int y = 2;y<=100;y+=2){
            //System.out.print(i+" ");
            //System.out.println(i+""+(i %2==0)+ (i%2!=0));
            //result+= i+"";
            resultEven = resultEven + y+ " ";

        }
        System.out.println(resultEven);

    }
}
