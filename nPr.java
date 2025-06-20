// Java program to calculate nPr using iteration
public class GfG {

    // Function to calculate factorial
    static long fact(int n)
    {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Function to calculate nPr
    static long nPr(int n, int r)
    {
        return fact(n) / fact(n - r);
    }

    public static void main(String[] args)
    {
        int n = 5;
        int r = 2;

        System.out.println(n + "P" + r + " = " + nPr(n, r));
    }
}