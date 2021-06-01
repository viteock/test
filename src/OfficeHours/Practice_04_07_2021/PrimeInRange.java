package OfficeHours.Practice_04_07_2021;

public class PrimeInRange {

        /*
        Given a number. Print out all the prime numbers from 2 to that number
        A prime number is a number that is only divisible by 1 and itself.
        Ex:
        Input:50
        Output:
        2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
         */
        public static void main(String[] args) {

            int number = 15;
            boolean isPrime = true;
//             50 / 2, 50 / 3, 50 / 4

            for(int i = 2; i < number; i++) {

                if (number % i == 0) {
                    isPrime = false;

                    break;
                }
            }
            System.out.println("prime number - " + isPrime);

            int number1 = 50;

            // 5/2, 5/3, 5/4

            for(int j = 2; j <= number1; j++) {
                boolean isPrime1 = true;

                for(int i = 2; i < j; i++){
                    if(j % i == 0) {
                        isPrime1 = false;
                        break;
                    }
                }

                if(isPrime1) {
                    System.out.print(j  + " ");
                }

            }
    }
}
