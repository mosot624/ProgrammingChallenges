package ProgrammingJava;

public class FizzBuzzProgrammingChallenges {
    public static void main(String[] args) {
        System.out.println(fizzString("fib"));
    }

    public static String fizzString(String str) {
        char[] fizzbuzz = str.toCharArray();
        if (fizzbuzz[0] == 'f') {
            if (fizzbuzz[str.length() - 1] == 'b') {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if (fizzbuzz[str.length() - 1] == 'b') {
            return "Buzz";
        }
        return "";
    }
}
