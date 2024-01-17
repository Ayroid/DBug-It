#include <stdio.h>
#include <stdbool.h>
#include <math.h>

// A Narcissistic decimal number is a non-negative integer, n that is equal to
// the sum of the m-th powers of each of the digits in the decimal representation
// of n, where m is the number of digits in the decimal representation of n.
// If n is 153 then m, (the number of decimal digits) is 3
// we have 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
// and so 153 is a narcissistic decimal number.

bool narcDecNum(long n)
{
    // write your code here
}

int main()
{
    int ctr = 0;
    for (long n = 0; ctr < 15; n++)
    {
        if (narcDecNum(n))
        {
            printf("%ld ", n);
            ctr++;
        }
    }
    printf("\n");

    return 0;
}
