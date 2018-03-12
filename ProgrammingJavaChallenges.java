package ProgrammingJava;

public class ProgrammingJavaChallenges {
    public static void main(String[] args){
        more20(62);
    }
    public static boolean more20(int n) {
        if(n%20==1 || n%20==2){
            System.out.println(n+" is 1 or 2 more");
            return true;
        }
        else{
            System.out.println("This is not");
            return false;
        }

    }
}
