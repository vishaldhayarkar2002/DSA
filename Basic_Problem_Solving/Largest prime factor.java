// Java code to find largest prime
// factor of number

class GfG {

    static int largestPrimeFactor(int n) {

        int largestPrime = -1;

        // Check for factors of 2
        while (n % 2 == 0) {
            largestPrime = 2;
            n /= 2;
        }

        // Check for odd factors starting from 3
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                largestPrime = i;
                n /= i;
            }
        }

        // If n is still greater than 2, it is
        // a prime number
        if (n > 2) {
            largestPrime = n;
        }

        return largestPrime;
    }

    public static void main(String[] args) {
        int n = 15;
        int res = largestPrimeFactor(n);
        System.out.println(res);
    }
}