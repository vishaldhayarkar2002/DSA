// Java program to print all
// three-primes smaller than
// or equal to N without using
// extra space
import java.util.*;

class GFG {

    // 3 divisor logic implementation
    // check if a number is
    // prime or not
    // if it is a prime then
    // check if its square
    // is less than or equal to
    // the given number
    static void numbersWith3Divisors(int n)
    {
        System.out.println("Numbers with 3 divisors : ");

        for (int i = 2; i * i <= n; i++) {

            // Check prime
            if (isPrime(i)) {
                    // Print numbers in
                    // the order of
                    // occurrence
                    System.out.print(i * i + " ");
            }
        }
    }

    // Check if a number is prime or not
    public static boolean isPrime(int n)
    {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 122;

        // Function call
        numbersWith3Divisors(n);
    }
}