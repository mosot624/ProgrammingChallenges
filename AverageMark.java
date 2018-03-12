package JavaWork;

public class AverageMark {
    public static void main(String[] args){
        int[] thisIsAnIntArray = new int[3];

        thisIsAnIntArray[0] =75;
        thisIsAnIntArray[1] =93;
        thisIsAnIntArray[2] =70;

        averageOfall(thisIsAnIntArray);

    }
    public static void averageOfall(int[] avgNumber){
        int avgOfall =0;
        for(int i = 0 ; i< avgNumber.length ; i++){
            avgOfall += avgNumber[i];
        }
        System.out.println(avgOfall /= avgNumber.length );

        if(avgOfall >= 60 && avgOfall <= 69 ){
            System.out.println("Over all grade C");
        }
        if(avgOfall >= 70 && avgOfall <= 79 ){
            System.out.println("Over all grade B");
        }
        if(avgOfall >= 80 && avgOfall <= 100 ){
            System.out.println("Over all grade A");
        }
    }
}
