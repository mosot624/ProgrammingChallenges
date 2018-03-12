public class SumOfnumber {
    public static void main(String[] args){
        SumOfAll("aa1bc2d3");
    }

    public static void SumOfAll(String l){
        char[] lToArray = l.toCharArray();
        int k = 0;
        for(int i = 0; i< lToArray.length; i++){
            if(Character.isDigit(lToArray[i])){
                int c = Character.getNumericValue(lToArray[i]);
                k += c;
            }

        }
        System.out.println(k);

    }
}
