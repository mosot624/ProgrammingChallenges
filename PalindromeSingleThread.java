package Programming;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.TimeUnit.SECONDS;

public class PalindromeSingleThread {
    private static int l = 0;
    private static Scanner scan1;
    private static String[] myStrings = {"No x in nixon", "sight", "farewell", "lace", "merchant", "jeff", "okinawa", "Laser", "Dragon", "Plane"};
    private static ArrayList<Integer> numberlist1 = new ArrayList<>();
    private static int averageTime;


    private PalindromeSingleThread() {
    }

    public static void Palindrome1() {
        //System.out.println("Input what word you want to reverse");#
        Random rand1 = new Random();
        int number1 = rand1.nextInt(9) + 0;

        String revword = myStrings[number1];
        String originalWord = revword;
        String s = "";
        String si = "";
        char[] letters = revword.toCharArray();

        //System.out.print("\nReverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            s += revword.charAt(i);
            si += revword.charAt(i);
        }
        //System.out.println(revword);
        s = s.toLowerCase();
        revword = revword.toLowerCase();
        s = s.replaceAll("\\s+", "").replaceAll("[^a-zA-Z]", "");
        revword = revword.replaceAll("\\s+", "").replaceAll("[^a-zA-Z]", "");
        if (s.equals(revword)) {
            //System.out.println("It's a palindrome");
            //System.out.println(originalWord);
        } else {
            //System.out.println("It's not a palindrome");
            //System.out.println(si);
        }

        //System.out.print("\n");
    }

    public static void whatTopalindrome() {


    }

    ;

    public static void main(String[] args) {

        for (int h = 0; h < 10; h++) {

            long start = System.currentTimeMillis();
            for (int i = 0; i < 10; i++) {
                Palindrome1();
            }
            long end = System.currentTimeMillis()-start;
            int endInt1 = (int) end;
            System.out.println(end  + " ms");
            numberlist1.add(endInt1);
        }

        for (int i = 0; i < numberlist1.size(); i++) {
            averageTime += numberlist1.get(i);
        }
        System.out.println("Overall time processing "+averageTime + "ms ");
        System.out.println("Single thread");
    }
}

