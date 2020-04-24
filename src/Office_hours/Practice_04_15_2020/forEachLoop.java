package Office_hours.Practice_04_15_2020;

public class forEachLoop {
    public static void main(String[] args) {
        int [ ] arr = {1,2,3,4};
        for(int  each:arr ) {
             if(each==3){
                 break;
             }
            System.out.println(each);

        }
    }
}
