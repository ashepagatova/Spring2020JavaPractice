package practice04_01_2020;

public class practice {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        String result = "";
        for (int i = arr.length-1;i>=0;i++){
            result +=arr[i];

        }
        System.out.println(result);
    }
}
