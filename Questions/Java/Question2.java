// Question 2.
// Program to Check if a number is prime or Not ?
// A prime number is a number that is divisible by 1 and itself only.

public class Question2 {
    public boolean isPrime(int n) {
        if (n < 1) {
            return false;
        }

        // Write
        // Your
        // Code
        // Here

        return true;
    }

    public static void main(String[] args) {
        Question2 q2 = new Question2();

        // Test Case 1: Prime number
        System.out.println("Test Case 1: " + q2.isPrime(7)); // Expected output: true

        // Test Case 2: Non-prime number
        System.out.println("Test Case 2: " + q2.isPrime(4)); // Expected output: false

        // Test Case 3: Edge case, smallest prime number
        System.out.println("Test Case 3: " + q2.isPrime(2)); // Expected output: true

        // Test Case 4: Edge case, smallest non-prime number
        System.out.println("Test Case 4: " + q2.isPrime(1)); // Expected output: true

        // Test Case 5: Edge case, negative number
        System.out.println("Test Case 5: " + q2.isPrime(-5)); // Expected output: false

        // Test Case 6: Edge case, large prime number
        System.out.println("Test Case 6: " + q2.isPrime(997)); // Expected output: true

        // Test Case 7: Edge case, large non-prime number
        System.out.println("Test Case 7: " + q2.isPrime(1000)); // Expected output: false
    }
}
