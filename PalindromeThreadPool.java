package Programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.TimeUnit.SECONDS;

public class PalindromeThreadPool implements Runnable {
    private static int l = 0;
    private static Scanner scan1;
    private static String[] myStrings = {"No x in nixon", "sight", "farewell", "lace", "merchant", "jeff", "okinawa", "Laser", "Dragon", "Plane"};
    private static ArrayList<Integer> numberlist1 = new ArrayList<>();
    private static int counter = 1;
    private static int overallTime;


    public static void PalindromeThreadPool() {
        long start = System.currentTimeMillis();
        for (int n = 0; n < 10; n++) {
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


        }
        long end = System.currentTimeMillis() - start;
        int endInt = (int) end;
        numberlist1.add(endInt);
        System.out.println(end + "ms ");

    }

    @Override
    public void run() {
        for (int l = 1; l <= 10; l++) {
            PalindromeThreadPool();


        }
    }

    public static void whatTopalindrome() {


    }

    ;


    public static void main(String[] args) {

        ExecutorService executor1 = Executors.newFixedThreadPool(3);


        executor1.execute(new PalindromeThreadPool());



        try {
            executor1.awaitTermination(1, SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int l = 0; l < numberlist1.size(); l++) {
            overallTime += numberlist1.get(l);


        }
        System.out.println("Overall processing time " + overallTime + "ms");
        System.out.println("Thread pool");
    }


    //long end = System.currentTimeMillis() - start;
    //System.out.println(end + " ms");
}



