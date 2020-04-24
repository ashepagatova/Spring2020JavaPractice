package day25_MethodRecap;

public class Frequency {
    public static void main(String[] args) {
        String str1 = "javajavajavajavajava";
        String str2 = "java";
        int count = 0;
        while (str1.contains(str2)) { // if repeding while loop
            count++;
            str1 = str1.replaceFirst(str2, " ");
            // we need to make sure we are not counting the same index over again

        }
        System.out.println(count);

        String a = "python python python";
        String b = "python";
        int num1 = Freequency(a,b); //3
        System.out.println(num1);
    }

    public static int Freequency(String str1, String str2) {
        int count = 0;
        while (str1.contains(str2)) { // if repeding while loop
            count++;
            str1 = str1.replaceFirst(str2, " ");
        }
        return count;
    }

}