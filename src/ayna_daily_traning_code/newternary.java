package ayna_daily_traning_code;

public class newternary {



    /**
    My friend has seen a gorgeous pair of shoes in Louis Vuitton. She will buy the shoes if they are less than $2000.
            if they are more than $1500 she will use credit card. if they are less than $ 1500 she will use debit.
            if LV has extra 20% off she will buy a scarf. If the shoes are more than $2000,
    she will buy from different brand.
            */

        public static void main(String[] args) {

        double shoesPrice=1800;

        double discount= shoesPrice*20/100;

        boolean discount1= false;
        String result=" ";
        if (shoesPrice<2000) {
            if (shoesPrice < 1500 && discount1){
                result="She will use a credit card and buy a scarf";
            } else if (shoesPrice>=1500 && discount1){
                result = "She will use a credit card and buy a scarf";
            } else {
                result= "She will be sad";
            }
        } else {
            result="Too, expensive, I will buy from different brand";
        }
        System.out.println(result);
    }


}
