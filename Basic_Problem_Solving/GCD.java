// Java program to find GCD of two numbers
import java.io.*;

class Test
{
    // Recursive method to return gcd of a and b
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b; 
        return gcd(b % a, a); 
    }
    
    // Driver method
    public static void main(String[] args) 
    {
        int a = 15, b = 20;
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
    }
}
// or you can directly use the Math.gcd() method in Java