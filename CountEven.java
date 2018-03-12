public class CountEven {
    public static void main(String[] args){
        int[] intArrayToanswer = new int[] {4,5,6,7,8};
        counterEvens(intArrayToanswer);
    }
    public static void counterEvens(int[] l){
        int counter1 = 0;
        for(int i = 0; i< l.length; i++){
            if(l[i]%2==0){
                counter1++;
            }
        }
        System.out.println(counter1);
    }
}
