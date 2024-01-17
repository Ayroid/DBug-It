#include <stdio.h>

// Find the Duplicate Number.
// Given an array of integers nums containing n + 1 integers where each integer
// is in the range [1, n] inclusive.

int findDuplicate(int *arr, int size)
{
    int i = 0;

    // Write Your Code Here

    for (int j = 0; j < size; j++)
    {
        if (arr[j] != j + 1)
        {
            return arr[j];
        }
    }
    return -1;
}

void swap(int *arr, int first, int second)
{

    // Write Your Code Here
}

int main()
{
    // Test Case 1
    int arr[] = {1, 3, 4, 2, 2};
    int size1 = sizeof(arr) / sizeof(arr[0]);
    printf("Test Case 1: %d\n", findDuplicate(arr, size1));

    // Test Case 2
    int arr2[] = {3, 1, 3, 4, 2};
    int size2 = sizeof(arr2) / sizeof(arr2[0]);
    printf("Test Case 2: %d\n", findDuplicate(arr2, size2));

    // Test Case 3
    int arr3[] = {1, 1};
    int size3 = sizeof(arr3) / sizeof(arr3[0]);
    printf("Test Case 3: %d\n", findDuplicate(arr3, size3));

    // Test Case 4
    int arr4[] = {1};
    int size4 = sizeof(arr4) / sizeof(arr4[0]);
    printf("Test Case 4: %d\n", findDuplicate(arr4, size4));

    return 0;
}
