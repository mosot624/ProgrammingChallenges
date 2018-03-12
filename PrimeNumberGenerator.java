package javaExample;

public class PrimeNumberGenerator {
    public static void main(String[] args){
        int counter = 1;
        int counterMax = 100;
        for(int i = 2; i==i;i++){
            boolean check1 = true;
            for (int j = 2; j<i; j++){
                if(i%j==0){
                    check1 = false;
                    break;
                }
            }
                if(check1 == true){
                    System.out.println(counter + ".) "+i+" is a prime number");
                    counter++;
                    //counterMax++;
                }
                else{
                    //System.out.println(i+" is not a prime number");
                }
                //if(counter == counterMax){
                    //break;
                }
            }

        }
    //}

