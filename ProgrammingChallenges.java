import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ProgrammingChallenges {
    public static void main(String[] args) {
        maxBlock("aaBBBCC");
    }

    public static void maxBlock(String l) {
        char[] lTochar = l.toCharArray();
        int[] amountOfNumber = new int[lTochar.length];
        int checker = 0;
        for (int i = 0; i < lTochar.length; i++) {
            try {

                if (lTochar[i] == lTochar[i - 1]) {
                    amountOfNumber[checker] += 1;
                }
                else{
                    checker++;
                    amountOfNumber[checker] +=1;
                }
            } catch (ArrayIndexOutOfBoundsException c) {
                amountOfNumber[checker] += 1;
            }
        }

        SortedSet set1 = new TreeSet();

        for (int i = 0; i<amountOfNumber.length; i++){
            set1.add(amountOfNumber[i]);
        }

        System.out.println("Overall number " + set1.last());

    }
}
