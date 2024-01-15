/**
 * Question1: How do you find the second largest number in an array in Java
 * without Sorting the Array?
 */
public class Question1 {

    public int findSecondHighest(int[] array) {
        if (array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int highest = array[0];
        int secondHighest = Integer.MIN_VALUE;

        // Write
        // Your
        // Code
        // Here

        return secondHighest;
    }

    public static void main(String[] args) {
        Question1 q1 = new Question1();
        int[] array1 = { 10, 5, 8, 15, 7 };
        System.out.println("Test Case 1: " + q1.findSecondHighest(array1)); // Expected output: 10

        // Test Case 2: Array with negative integers
        int[] array2 = { -5, -10, -3, -8 };
        System.out.println("Test Case 2: " + q1.findSecondHighest(array2)); // Expected output: -5

        // Test Case 3: Array with repeated values
        int[] array3 = { 5, 5, 5, 5 };
        System.out.println("Test Case 3: " + q1.findSecondHighest(array3)); // Expected output: 5

        // Test Case 4: Array with only one element
        int[] array4 = { 7 };
        System.out.println("Test Case 4: " + q1.findSecondHighest(array4)); // Expected output: 7

        // Test Case 5: Empty array
        int[] array5 = {};
        System.out.println("Test Case 5: " + q1.findSecondHighest(array5)); // Expected output: Integer.MIN_VALUE
    }

}