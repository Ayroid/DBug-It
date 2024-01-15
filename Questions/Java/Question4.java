public class Question4 {
    public class NarcissisticNumber {
        public static void main(String[] args) {
            for (int n = 0, ctr = 0; ctr < 15; n++) {
                if (is_narc_dec_num(n)) {
                    System.out.print(n + " ");
                    ctr++;
                }
            }
            System.out.println();
        }

        public static boolean is_narc_dec_num(long n) {
            // write
            // your
            // code
            // here
        }
    }

    public static void main(String[] args) {
        // Test Case 1: Narcissistic number (1^1 = 1)
        long num1 = 1;
        System.out.println("Test Case 1: " + NarcissisticNumber.is_narc_dec_num(num1)); // Expected output: true

        // Test Case 2: Narcissistic number (2^1 = 2)
        long num2 = 2;
        System.out.println("Test Case 2: " + NarcissisticNumber.is_narc_dec_num(num2)); // Expected output: true

        // Test Case 3: Not a narcissistic number (3^1 != 3)
        long num3 = 3;
        System.out.println("Test Case 3: " + NarcissisticNumber.is_narc_dec_num(num3)); // Expected output: false

        // Test Case 4: Narcissistic number (89^2 + 9^2 = 8101)
        long num4 = 8101;
        System.out.println("Test Case 4: " + NarcissisticNumber.is_narc_dec_num(num4)); // Expected output: true

        // Test Case 5: Not a narcissistic number (123^3 != 123)
        long num5 = 123;
        System.out.println("Test Case 5: " + NarcissisticNumber.is_narc_dec_num(num5)); // Expected output: false

        // Test Case 6: Negative number
        long num6 = -1634;
        System.out.println("Test Case 6: " + NarcissisticNumber.is_narc_dec_num(num6)); // Expected output: false
    }
}
