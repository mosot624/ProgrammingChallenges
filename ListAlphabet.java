package javaExample;

import java.util.Scanner;

public class ListAlphabet {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        do{
        System.out.println("Input what word you want to reverse");
        String revword = scan1.nextLine();
        char[] letters = revword.toCharArray();
        System.out.print("\n");
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");
        }while(true);

    }
}