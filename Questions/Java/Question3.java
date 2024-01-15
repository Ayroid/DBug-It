// Question 3
// Program to Search array in O(logn) complexity.

public class Question3 {

    public int search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            // write
            // your
            // code
            // here
        }

        return -1;
    }

    public static void main(String[] args) {

        Question3 q3 = new Question3();

        int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Test Case 1
        int target1 = 5;
        System.out.println("Test Case 1: " + q3.search(array1, target1));

        // Test Case 2
        int[] array2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target2 = 1;
        System.out.println("Test Case 2: " + q3.search(array2, target2));

        // Test Case 3
        int[] array3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target3 = 10;
        System.out.println("Test Case 3: " + q3.search(array3, target3));

        // Test Case 4
        int[] array4 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target4 = 15;
        System.out.println("Test Case 4: " + q3.search(array4, target4));

        // Test Case 5
        int[] array5 = {};
        int target5 = 5;
        System.out.println("Test Case 5: " + q3.search(array5, target5));
    }
}
