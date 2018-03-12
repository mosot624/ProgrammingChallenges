package ProgrammingJava;

public class JavaChallenges {
    public static void main(String[] args){
    checker(5,1);
    }

    public static boolean checker(int a, int b){
        if(a == 3 || b == 9){
            System.out.println("That is true");
            return true;

        }
        else {
            if((a + b)  == 6 || (b - a) == 6 || (a - b) == 6){
                System.out.println("That is true");
                return true;
            }
            else{
                System.out.println("That is false");
                return false;
            }
        }
    }
}
