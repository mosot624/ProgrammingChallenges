public class MyClass {
    public static void main(String args[]) {
        int num = 31;
        Boolean j= true;
        for(int i= 2; i&lt;num;i++){
            if(num%i==0){
                j= false;
                break;
            }
        }
        if(j==true)
        {
            System.out.println(&quot;Prime Number&quot;);
        }
        else{
            System.out.println(&quot;Not a prime&quot;);
        }
    }
}

