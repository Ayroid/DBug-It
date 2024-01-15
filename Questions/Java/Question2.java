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

        // Test Case 1
        System.out.println("Test Case 1: " + q2.isPrime(7));

        // Test Case 2
        System.out.println("Test Case 2: " + q2.isPrime(4));

        // Test Case 3=
        System.out.println("Test Case 3: " + q2.isPrime(2));

        // Test Case 4
        System.out.println("Test Case 4: " + q2.isPrime(1));

        // Test Case 5
        System.out.println("Test Case 5: " + q2.isPrime(-5));

        // Test Case 6
        System.out.println("Test Case 6: " + q2.isPrime(997));

        // Test Case 7
        System.out.println("Test Case 7: " + q2.isPrime(1000));
    }
}
