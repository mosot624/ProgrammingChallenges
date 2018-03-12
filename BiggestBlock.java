public class BiggestBlock {
    public static void main(String[] args){
        maxBlock(5);
    }
    public static void maxBlock(int l){

        for(int i = 0; i<= l;i++){
            for(int q = 1; q<=i;q++){
                System.out.print(q);
            }
            System.out.println();
        }

    }
}
