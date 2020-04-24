package Office_hours.Practice_04_15_2020;
import java.util.Arrays;
public class ArrasUtility {
    public static void main(String[] args) {
        /*
        Arrays utility class
        Array.Sort sorting in ascending order
        Arrays.equal checks equality of Array
        Arrays.toString concerts to to the string
        Arrays.deepToString converts multi dementional array to the string
         */
        int [] arr= {9,8,7,6,5,4,3,2};
        Arrays.sort(arr); // sort Array to Ascending order
        System.out.println(Arrays.toString(arr));

        System.out.println("=========");
        int [] salary ={9,8,7,6,5,4,3,2,1};
        int length = salary.length;
        int  lastInx = length-1;
        Arrays.sort(salary);// Ascending order
        System.out.println(Arrays.toString(salary));
        System.out.println("Minimum Salary :"+salary[0]);
        System.out.println("Max salary:"+salary[lastInx]);
        //System.out.println("Max salary:"+salary.length-1);

        int [] arr1 ={1,2,3};
        int [] arr2 ={1,2,3};
        System.out.println(Arrays.equals(arr1,arr2));// checks equality or 2 arrays

         int [] arr3 ={9,8,7,6,5,4,3,2,1};
         int [] arr4 ={1,2,3,4,5,6,7,8,9};

         Arrays.sort(arr3);
         Arrays.sort(arr4);
        System.out.println(Arrays.equals(arr3,arr4));



    }
}
