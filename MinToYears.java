public class MinToYears {

    public static void printYearsAndDays(long minutes){

        long years = minutes / 525600;
        long days = (minutes / 1440) % 365;

        if((minutes < 0)){
            System.out.println("Invalid Value");
        } else  System.out.println(minutes + " min = " + years + " y and " + days + " d");

    }
}
