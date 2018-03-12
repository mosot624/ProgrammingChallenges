public class HappyG {

    public static void main(String[] args) throws java.lang.Exception {
        double start = System.currentTimeMillis();
        gHappy("zzzggg");
        double end = System.currentTimeMillis() - start;
        System.out.println(end + " ms");
    }

    public static void gHappy(String l) {
        char[] lArray = l.toCharArray();
        boolean gIsHappy = false;
        boolean allGisHappy = true;
        for (int i = 0; i < lArray.length; i++) {
            if (lArray[i] == 'g') {
                try {
                    if ((lArray[i + 1] == 'g') || (lArray[i - 1] == 'g')) {
                        gIsHappy = true;

                    } else {
                        gIsHappy = false;
                        allGisHappy = false;
                    }
                } catch(ArrayIndexOutOfBoundsException x) {

                }
            }
        }
        if (gIsHappy == true && allGisHappy == true) {
            System.out.println("This is true");
        }
        else{
            System.out.println("This is false");
        }

    }


}
