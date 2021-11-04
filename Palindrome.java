public class Palindrome {

//    public static boolean isPalindrome(int number) {
//        int Palin = number;
//        int reverse = 0;
//        while(Palin != 0){
//            int  LastDigit = Palin % 10;
//            reverse = reverse * 10 + LastDigit;
//            Palin /= 10;
//        }
//        return(number == reverse);
//    }

    //Arguments, resembling variables, are used to pass data from
    // one workflow to another. They can store data dynamically
    // and pass it on. One difference between variable and argument is that variables pass
    // data to other activities while arguments pass data to other workflows.


        public static boolean isPalindrome(int number) {
            int palindrome = number; // copied number into variable
            int reverse = 0;

            while (palindrome != 0) {
                int remainder = palindrome % 10;
                reverse = reverse * 10 + remainder;
                palindrome = palindrome / 10;
            }

            // if original and reverse of number is equal means
            // number is palindrome in Java
            if (number == reverse) {
                return true;
            }
            return false;
        }
}
