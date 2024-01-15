public class Question3 {
    public class BinarySearch {
        static int binarySearch(int[] arr, int target) {

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
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target1 = 5;
        System.out.println("Test Case 1: " + BinarySearch.binarySearch(array1, target1)); // Expected output: 4

        // Test Case 2: Element found at the beginning
        int[] array2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target2 = 1;
        System.out.println("Test Case 2: " + BinarySearch.binarySearch(array2, target2)); // Expected output: 0

        // Test Case 3: Element found at the end
        int[] array3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target3 = 10;
        System.out.println("Test Case 3: " + BinarySearch.binarySearch(array3, target3)); // Expected output: 9

        // Test Case 4: Element not found
        int[] array4 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target4 = 15;
        System.out.println("Test Case 4: " + BinarySearch.binarySearch(array4, target4)); // Expected output: -1

        // Test Case 5: Empty array
        int[] array5 = {};
        int target5 = 5;
        System.out.println("Test Case 5: " + BinarySearch.binarySearch(array5, target5)); // Expected output: -1
    }
}
