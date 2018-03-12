public class UnlimitedAmountOfPrimeNumber {
    public static void main(String args[]) {
        int num = 30;
        for(int i = 3;i==i;i++){
            Boolean check = true;
            for(int j =2; j&lt;i;j++){
                if(i%j==0){
                    check=false;
                    break;
                }
            }
            if(check==true){
                System.out.println(i+&quot; is a prime number&quot;);
            }
            else{
                //System.out.println(i+&quot; is not a prime number&quot;);
            }
        }
    }
}

