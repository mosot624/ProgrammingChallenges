package JavaWork;

public class ExponentialWork {
    public static void main(String[] args){
        exponentialWork(7,5);
    }

    public static void exponentialWork(int m, int c){
        int l = 1;
        for(int i = 0; i<c;i++){
            l *= m;
            System.out.print(l + " ");
        }
    }
}
