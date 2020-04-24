package day21_MultidementialArray;

public class zoo {
    public static void main(String[] args) {
        String[] wildAnimal ={"tider","turtel","leopard","lion","corcodaile"};
        String[]  bird = {"Eagle","Duck","Chiken","Peockok"};
        String[][]  zoo ={wildAnimal,bird};
        String add = zoo[1][2];

        System.out.println(add);

        System.out.println("+++++++++++++");

        for(String total:zoo[1]){
            if(total== "Chiken") {
                continue;

            }
            System.out.println(total);
        }
         for(String total2:zoo[0]){
              if(total2.equals("turtel")){
                continue;
              }
             System.out.println(total2);
         }
    }
}
