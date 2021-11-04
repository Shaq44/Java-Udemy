 public class BarkingDog {

public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if (barking && hourOfDay < 0){
            System.out.println("False");

        } else if (barking && hourOfDay > 23) {
            System.out.println("False");
        } else if ( barking && hourOfDay >= 0){
            System.out.println("true");
        } else if (barking && hourOfDay >= 23){
            System.out.println("True");

        }
        return false;


    }
 }
