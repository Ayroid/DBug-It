// Question1:
// How do you find the second largest number in an array in C
// without Sorting the Array?

#include <stdio.h>
#include <limits.h>

// Function to find the second highest number in an array
int findSecondHighest(int array[])
{
    // Check if the array is empty
    if (array[0] == '\0')
    {
        return INT_MIN;
    }

    // Initialize variables
    int highest = array[0];
    int secondHighest = INT_MIN;

    // Write
    // Your
    // Code
    // Here

    return secondHighest;
}

int main()
{
    // Test Case 1
    int array1[] = {10, 5, 8, 15, 7};
    printf("Test Case 1: %d\n", findSecondHighest(array1));

    // Test Case 2
    int array2[] = {-5, -10, -3, -8};
    printf("Test Case 2: %d\n", findSecondHighest(array2));

    // Test Case 3
    int array3[] = {5, 5, 5, 5};
    printf("Test Case 3: %d\n", findSecondHighest(array3));

    // Test Case 4
    int array4[] = {7};
    printf("Test Case 4: %d\n", findSecondHighest(array4));

    // Test Case 5
    int array5[] = {};
    printf("Test Case 5: %d\n", findSecondHighest(array5));

    return 0;
}
