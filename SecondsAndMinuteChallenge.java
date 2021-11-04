public class SecondsAndMinuteChallenge {

    public static long getDurationString(long minutes, long seconds){

        long xx = minutes / 60;
        long yy = minutes % 60;


        if ((minutes >=0) || (seconds >=0 & seconds <= 59)){
            System.out.println("The Times is " + xx  + " hrs " + yy +" Min " + seconds + " Sec ");

        } return -1;



    }

    public static long getDurationString(long minutes){

        long xx = minutes / 60;

        if( minutes >= 0 ){

            System.out.println(" The Time is " + minutes + " Min " + xx + " Sec");

        } return -1;
    }


}
