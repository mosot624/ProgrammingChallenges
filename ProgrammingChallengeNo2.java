package ProgrammingJava;

public class ProgrammingChallengeNo2 {
    public static void main(String[] args) {
        System.out.println(blueTicket(20, 5, 10));

    }

    public static int blueTicket(int a, int b, int c) {
        int m = a + b;
        int n = b + c;
        int o = a + c;
        if (m == 10 || n == 10 || o == 10) {
            return 10;

        } else {
            if (m == n + 10) {
                return 5;
            } else if (m == o + 10) {
                return 5;
            } else {
                return 0;
            }
        }
    }

}
