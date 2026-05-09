// Java program to find GCD of two numbers
import java.io.*;

class Test
{
    // Recursive function to return gcd of a and b
    static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b); 
    }
    
    // Driver method
    public static void main(String[] args) 
    {
        int a = 98, b = 56;
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
    }
}
int num = 5, den = 2;
double result = num / den;  // 2.0 (wrong: 5/2 = 2 in int)
double correct = (1.0 * num) / den;  // 2.5 (right)