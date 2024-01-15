public class Question2 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        // Write
        // Your
        // Code
        // Here
        return true;
    }

    public static void main(String[] args) {

        // Test Case 1: Prime number
        System.out.println("Test Case 1: " + isPrime(7)); // Expected output: true

        // Test Case 2: Non-prime number
        System.out.println("Test Case 2: " + isPrime(4)); // Expected output: false

        // Test Case 3: Edge case, smallest prime number
        System.out.println("Test Case 3: " + isPrime(2)); // Expected output: true

        // Test Case 4: Edge case, smallest non-prime number
        System.out.println("Test Case 4: " + isPrime(1)); // Expected output: false

        // Test Case 5: Edge case, negative number
        System.out.println("Test Case 5: " + isPrime(-5)); // Expected output: false

        // Test Case 6: Edge case, large prime number
        System.out.println("Test Case 6: " + isPrime(997)); // Expected output: true

        // Test Case 7: Edge case, large non-prime number
        System.out.println("Test Case 7: " + isPrime(1000)); // Expected output: false
    }
}
