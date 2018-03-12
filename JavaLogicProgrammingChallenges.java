package ProgrammingJava;

public class JavaLogicProgrammingChallenges {
    public static void main(String[] args) {
        System.out.println(squirrelPlayChallenge(95, true));
    }

    public static boolean squirrelPlayChallenge(int temp, boolean isSummer) {

        if (isSummer == true) {
            if (temp >= 60 && temp <= 100) {
                return true;
            } else {
                return false;
            }

        } else {
            if (temp >= 60 && temp <= 90) {
                return true;
            } else {
                return false;
            }
        }
    }
}
