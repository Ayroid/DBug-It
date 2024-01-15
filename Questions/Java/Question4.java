// Ques4: Program to generate and show the first 15 narcissistic decimal numbers.

// A Narcissistic decimal number is a non-negative integer, n that is equal to the sum of the m-th powers of each of the digits in the decimal representation of n, where m is the number of digits in the decimal representation of n.

// If n is 153 then m, (the number of decimal digits) is 3
// we have 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
// and so 153 is a narcissistic decimal number.

public class Question4 {

    public boolean narcDecNum(long n) {
        // write
        // your
        // code
        // here
    }

    public static void main(String[] args) {
        Question4 q4 = new Question4();
        int ctr = 0;
        for (int n = 0; ctr < 15; n++) {
            if (q4.narcDecNum(n)) {
                System.out.print(n + " ");
                ctr++;
            }
        }
        System.out.println();
    }
}
