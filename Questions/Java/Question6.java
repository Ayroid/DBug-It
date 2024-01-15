// Ques 6 : Find the Duplicate Number.
// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

public class Question6 {
    public int findDuplicate(int[] arr) {
        int i = 0;

        // Write
        // Your
        // Code
        // Here

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return arr[j];
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {

        // Write
        // Your
        // Code
        // Here

    }

    public static void main(String[] args) {
        Question6 q6 = new Question6();

        // Test Case 1
        int[] arr = { 1, 3, 4, 2, 2 };
        System.out.println("Test Case 1: " + q6.findDuplicate(arr));

        // Test Case 2
        int[] arr2 = { 3, 1, 3, 4, 2 };
        System.out.println("Test Case 2: " + q6.findDuplicate(arr2));

        // Test Case 3
        int[] arr3 = { 1, 1 };
        System.out.println("Test Case 3: " + q6.findDuplicate(arr3));

        // Test Case 4
        int[] arr4 = { 1 };
        System.out.println("Test Case 4: " + q6.findDuplicate(arr4));

        // Test Case 5
        int[] arr5 = {};
        System.out.println("Test Case 5: " + q6.findDuplicate(arr5));
    }

}
