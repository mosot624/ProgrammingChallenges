package ProgrammingJava;

public class sumLimit {
    public static void main(String[] args) {
        System.out.println(sumLimit(95, 15));
    }

    public static int sumLimit(int a, int b) {
        int c = a + b;
        String aIntString = String.valueOf(a);
        String CInt = String.valueOf(c);
        char[] CChar = CInt.toCharArray();
        char[] aChar = aIntString.toCharArray();


        if (CChar.length != aChar.length) {
            return a;
        } else {
            return c;
        }

    }
}
