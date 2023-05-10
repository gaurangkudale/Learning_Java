package org.autoevaluate.ControlFlow;

public class PrimeNumber {

    public static void main(String[] args) {
        int counter = 0;

        int i;
        for (i = 10; i <= 50; i++) {
            System.out.println(isPrime(i));

            if (isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
                counter ++;

                if (counter == 3){
                    System.out.println("found 3 prime numbers and Eciting the loop");
                    break;
                }
            }
        }

        System.out.println("Total number of prime num are " + counter);
    }

    public static boolean isPrime(int number){
        if(number <= 2){
            return (number ==2);
        }
        for (int i = 2; i <= number/2 ; i++) {
            if(number % (i) == 0){
                return false;
            }
        }
        return true;

    }


}
