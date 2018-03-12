package Java;

import java.util.Scanner;

public class HelloWorld {

    private static boolean birthday;
    private static Scanner scan1;
    private static int speedGlobal;

    public static void main(String[] args) {
        whatSpeedAreyouGoingAt();
        int i = tickerLevel(speedGlobal, birthday);
        System.out.println("Your ticket is " + i);


    }

    public static void whatSpeedAreyouGoingAt() {
        Scanner scan2 = new Scanner(System.in);
        boolean loopchecker = true;
        System.out.println("What speed are you going at");
        speedGlobal = scan2.nextInt();
        System.out.println("Is it your birthday");
        do {
            String yeorno = scan2.next();
            if (yeorno.equals("y")) {
                birthday = true;
                loopchecker = false;
            } else if (yeorno.equals("n")) {
                birthday = false;
                loopchecker = false;
            }
            else{
                System.out.println("Only write y or n");
            }
        } while (loopchecker == true);
    }


    public static int tickerLevel(int speed, boolean isYourBirthday) {
        if (speed >= 0 && speed <= 65) {
            if (isYourBirthday == true && speed <= 65) {
                System.out.println("Its your birthday");
                return 0;

            } else {
                return 1;
            }
        } else if (speed >= 66 && speed <= 85) {
            if (isYourBirthday == true && (speed <= 85 || speed <= 66)) {
                System.out.println("Its your birthday");
                return 1;

            } else {
                return 2;
            }
        } else if (speed >= 86) {
            if (isYourBirthday == true && speed <= 86) {
                System.out.println("Its your birthday");
                return 2;
            } else {
                return 3;
            }
        }


        return 10;


    }
}