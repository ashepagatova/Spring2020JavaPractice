package day16_ForLoop;

public class EssendingDessendingOrder {
//    5. Write a program that will print out all letters in English alphabet in ascending order
//	6. Write a program that will print out all letters in English alphabet in descedning order
public static void main(String[] args) {

    for(char ch = 'A';ch<='Z';ch++){
        System.out.print(ch+" ");
    }
    System.out.println();

    for(char ch1 = 'Z';ch1>='A';ch1--){
        System.out.print(ch1+" ");
    }
    System.out.println();
    for(char ch2 = 'a';ch2<='z';ch2++){
        System.out.print(ch2+" ");
    }
    System.out.println();
    for(char ch3 = 'z';ch3>='a';ch3--) {
        System.out.print(ch3 + " ");
    }
}
}
