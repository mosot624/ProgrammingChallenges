package javaProgramming;


import java.util.Scanner;

public class MultipleChoiceQuestionaire {
    private static int mark = 0;
    private static int AmountOfQuestion = 0;

    public static void main(String[] args) {
        if (doYouWannaPlay() == true) {
            firstQuestion();
            if (LastQuestion() == true) {
                System.out.println("Score: " + mark + "/" + AmountOfQuestion);
            }
        }
    }

    public static boolean doYouWannaPlay() {
        do {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Do you wanna play? Y/N");
            String checkerline8 = sc1.nextLine();
            if (checkerline8.equals("Y")) {
                System.out.println("Well so you can play");
                return true;
            } else if (checkerline8.equals("N")) {
                System.out.println("Thank you for answering");
                return false;
            } else {
                System.out.println("That is not one of the choices");
            }
        } while (true);

    }

    public static int firstQuestion() {
        AmountOfQuestion++;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("What is the answer for this question");
        System.out.println("How far is the sun from us?");
        System.out.println("A.) 500 miles");
        System.out.println("B.) 300 miles");
        System.out.println("C.) 1,000,000 miles");
        System.out.println("D.) 100,000 miles");
        System.out.println("E.) none of the above");
        System.out.println("Your answer should be in capital letter");


        do {
            char[] answerInArray;
            String checkerline8;
            do {
                checkerline8 = sc1.nextLine();
                if (checkerline8.length() == 1) {
                    answerInArray = checkerline8.toCharArray();
                    break;
                }
                System.out.println("That is not a letter");
            } while (true);
            if (answerInArray[0] > '@' && answerInArray[0] < 'F') {
                if (answerInArray[0] == 'E') {
                    mark++;
                    System.out.println("That is the correct answer");
                    return 0;
                } else {
                    System.out.println("That is the incorrect answer");
                    return 0;
                }
            } else {
                System.out.println("Not part of the choice");
            }

        } while (true);
    }

    public static boolean LastQuestion() {
        AmountOfQuestion++;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("How many atoms in the universe");
        System.out.println("A.) 500 atoms");
        System.out.println("B.) 300 atoms");
        System.out.println("C.) 1,000,000 atoms");
        System.out.println("D.) 100,000 atoms");
        System.out.println("E.) none of the above");
        System.out.println("Your answer should be in capital letter");


        do {
            char[] answerInArray;
            String checkerline8;
            do {
                checkerline8 = sc1.nextLine();
                if (checkerline8.length() == 1) {
                    answerInArray = checkerline8.toCharArray();
                    break;
                }
                System.out.println("That is not a letter");
            } while (true);

            if (answerInArray[0] > '@' && answerInArray[0] < 'F') {
                if (answerInArray[0] == 'E') {
                    mark++;
                    System.out.println("That is the correct answer");
                    return true;
                } else {
                    System.out.println("That is the incorrect answer");
                    return true;
                }
            } else {
                System.out.println("Not part of the choice");
            }

        } while (true);
    }
}
