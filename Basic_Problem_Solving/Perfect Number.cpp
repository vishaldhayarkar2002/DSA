// C++ program to check if a given number is perfect
// or not
#include <iostream>
using namespace std;

// Returns true if n is perfect
bool isPerfect(long long int n)
{
    // To store sum of divisors
    long long int sum = 1;

    // Find all divisors and add them
    for (long long int i = 2; i * i <= n; i++)
    {
        if (n % i == 0)
        {
            if (i * i != n)
                sum = sum + i + n / i;
            else
                sum = sum + i;
        }
    }
    // If sum of divisors is equal to
    // n, then n is a perfect number
    if (sum == n && n != 1)
        return true;

    return false;
}

// Driver program
int main()
{
    int n = 28;
    cout <<(isPerfect(n) ?"true" : "false");

    return 0;
}