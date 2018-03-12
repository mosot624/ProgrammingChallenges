public class AddingNotAfterIs {
    public static void main(String[] args) {
        Afteris("What is the best coffe");
    }

    public static void Afteris(String l) {
        char[] lToChar = l.toCharArray();


        for (int i = 0; i < lToChar.length; i++) {
            System.out.print(lToChar[i]);
            if (lToChar[i] == 's') {
                if (lToChar[i - 1] == 'i') {
                    try {
                        if (lToChar[i - 2] == ' ') {
                            System.out.print(" not");
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.print(" not");
                    }
                }
            }
        }
    }

}
