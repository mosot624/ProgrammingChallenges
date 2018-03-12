public class FindFirstNPrimeNumbers {
    public static void main(String args[]) {
        int counter = 1;
        int counterMax= 100;
        for(int i = 2;i==i;i++){
            Boolean check = true;
            for(int j =2; j&lt;i;j++){
                if(i%j==0){
                    check=false;
                    break;
                }
            }
            if(check==true){
                System.out.println(counter+&quot;.) &quot;+i+&quot; is a prime number&quot;);
                counter++;
            }
            else{
                //System.out.println(i+&quot; is not a prime number&quot;);
            }
            if(counter&gt;counterMax){
            break;
            }
            }

    }
}




