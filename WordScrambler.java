import java.util.Random;

public class WordScrambler {

    public static void main(String[] args){
        Scrambler("WhatWordIsThis?");
    }
    public static void Scrambler(String l){
        char[] lArray = l.toCharArray();
        char[] scrambleArray = new char[lArray.length];

        for(int i = 0; i < lArray.length; i++){
            Random ran = new Random();
            int x = ran.nextInt(lArray.length ) + 0;
            char z = lArray[i];
            if (Character.isLetter(scrambleArray[x])) {
                i--;
            }
            else{
                scrambleArray[x]=z;
            }

        }
        for(int i = 0; i < scrambleArray.length; i++){
            System.out.print(scrambleArray[i]);
        }
    }
}
