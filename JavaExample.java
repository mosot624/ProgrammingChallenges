package Programming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class JavaExample {
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        List<Integer> list1 = new ArrayList<>();
        for(int i =0; i < 1E5; i++ ){
            list1.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println((end - start)+" ms");

        Long start1 = System.currentTimeMillis();

        List<Integer> list2 = new LinkedList<Integer>();

        for(int i =0; i < 1E5; i++ ){
            list2.add(0,i);
        }

        Long end1 = System.currentTimeMillis();

        System.out.println((end1 - start1) +" ms");
    }
}
