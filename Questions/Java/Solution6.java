// Ques 6 : Find the Duplicate Number.
// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

public class Solution6 {
    public int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return arr[j];
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        Solution6 q6 = new Solution6();
        int[] arr = { 1, 3, 4, 2, 2 };
        System.out.println("Test Case 1: " + q6.findDuplicate(arr)); // Expected output: 2

        // Test Case 2: Array with negative integers
        int[] arr2 = { 3, 1, 3, 4, 2 };
        System.out.println("Test Case 2: " + q6.findDuplicate(arr2)); // Expected output: 3

        // Test Case 3: Array with repeated values
        int[] arr3 = { 1, 1 };
        System.out.println("Test Case 3: " + q6.findDuplicate(arr3)); // Expected output: 1

        // Test Case 4: Array with only one element
        int[] arr4 = { 1 };
        System.out.println("Test Case 4: " + q6.findDuplicate(arr4)); // Expected output: -1

        // Test Case 5: Empty array
        int[] arr5 = {};
        System.out.println("Test Case 5: " + q6.findDuplicate(arr5)); // Expected output: -1
    }

}
