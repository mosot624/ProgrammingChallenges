package JavaWork;

public class BinaryFlipper {
    public static void main(String[] args){
        flipIt(10010101);
    }
    private static void flipIt(int intputInt){
        char[] intputIntToCharArray = Integer.toString(intputInt).toCharArray();
        for(int i = 0 ; i<intputIntToCharArray.length; i++){
            if(intputIntToCharArray[i]=='1'){
                System.out.print("0");
            }
            else {
                System.out.print("1");
            }
        }
    }
}
