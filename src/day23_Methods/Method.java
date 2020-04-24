package day23_Methods;

public class Method {
    /*
       step1: Hello Cybertek
step2: Hello World 5 times
step3: Hello Btach 18
step4: Hello World 5 times
step5: Helle Saim
step6: Hello World 5 times
        */
    public static void main(String[] args) {
        printHelloWorld();
        System.out.println("Hello Cybertek");
        printHelloWorld();
        System.out.println("Hello Batch 18");
        printHelloWorld();
        System.out.println("hello Saim");
        printHelloWorld();
        System.out.println("================");
        evenNumbers();
        oddNumbers();
    }

    public static void printHelloWorld() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

    }

    public static void evenNumbers() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    public static void oddNumbers() {
        for (int j = 0; j < 100; j++) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }
    }
}
