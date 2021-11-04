public class LeapYear {

    public static boolean isLeapYear(int year) {

        int Step1 = year % 4;
        int Step2 = year % 100;
        int Step3 = year % 400;

        if (year >= 1 & year <= 9999) {
            return Step1 == 0 & Step2 == 0 & Step3 == 0 || Step1 == 0 & Step2 != 0;
        }
        return false;


    }

    public static int getDaysInMonths(int month, int year){


        switch (month & year){
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
            default:
                System.out.println(month < 1 && month > 12 && year < 1 && year > 12);
                break;

        }
        return -1;



    }
}
