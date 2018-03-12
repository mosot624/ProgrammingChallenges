package JavaWork;

public class FirstHalf {
    public static void main(String[] args){
        firstHalf("What is the 1st half of this string");
    }
    public static void firstHalf(String inputString){
        char[] inputStringtoCharArray = inputString.toCharArray();
        System.out.println(inputStringtoCharArray.length);
        for(int i =0 ; i< inputStringtoCharArray.length /2 ; i++){
            System.out.print(inputStringtoCharArray[i]);
        }
    }
}
