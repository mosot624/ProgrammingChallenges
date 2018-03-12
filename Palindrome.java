package projectWork;

import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Palindrome
{


    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        ExecutorService executor1 = Executors.newFixedThreadPool(5);
        do{
            long start = System.currentTimeMillis();
            System.out.println("Input what word you want to reverse");
            String revword = "No x in Nixon";
            String originalWord = revword;
            String s="";
            String si = "";
            char[] letters = revword.toCharArray();

            System.out.print("\nReverse string: ");
            for (int i = letters.length -1 ; i >= 0; i--) {
                s += revword.charAt(i);
                si += revword.charAt(i);
            }
            System.out.println(revword);
            s = s.toLowerCase();
            revword = revword.toLowerCase();
            s = s.replaceAll("\\s+","").replaceAll("[^a-zA-Z]", "");
            revword = revword.replaceAll("\\s+","").replaceAll("[^a-zA-Z]", "");
            if(s.equals(revword)){
                System.out.println("It's a palindrome");
                System.out.println(originalWord);
            }
            else{
                System.out.println("It's not a palindrome");
                System.out.println(si);
            }

            System.out.print("\n");
            long end = System.currentTimeMillis();
            System.out.println((end - start)+" ms");
        }while(true);

    }
}
