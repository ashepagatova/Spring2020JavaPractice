package day27_DateTime;

public class unique_Arrays {
    public static void main(String[] args) {
        /*
        3. write a method that can print out the unique elements from an int array
					Ex: {1,1,2,3,3} ==> 2
						{6,6,7,7,8,9} ==> 8 9
		4. write a method that can print out the unique elements from a double array
					Note: Apply method overloading
         */
         int[]  arr = {1,1,2,3,3,4,5,6};

        for (int each2:arr) {


         int unique = 0;
         for(int each: arr){
             if(each==each2){
                 unique++;
             }

         }
       if(unique==1){
           System.out.println(each2);

       }
    }
        System.out.println("=============");
        int[]  arr2 = {1,2,3,65,3,2,9,7,3};
        uniqueElements(arr2);
        System.out.println("============");

        double[]arr3 = {1.2,3.4,5.6,3.4,5.6,3.5};// we able to print unique elements with array after we did frequency test
        uniqueElements(arr3);   // we call method double

    }public  static void uniqueElements(int[]arr){
        for (int each2:arr) {
            int unique = 0;
            for(int each: arr){
                if(each==each2){
                    unique++;
                }

            }
            if(unique==1){
                System.out.println(each2);
            }
        }
    }public static void uniqueElements(double[]arr){
        for (double each2:arr) {
            int unique = 0;
            for(double each: arr){
                if(each==each2){
                    unique++;
                }

            }
            if(unique==1){
                System.out.println(each2);
            }
        }
    }

}
