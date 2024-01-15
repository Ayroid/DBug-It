// Question 5
// Check if the sentence is Pangram.
// A Pangram is a sentence where every letter of the English alphabet appears at least once.

public class Question5 {
    public boolean checkIfPangram(String sentence) {
        // Write
        // Your
        // Code
        // Here
    }

    public static void main(String[] args) {
        Question5 q5 = new Question5();

        // Test Case 1: Pangram
        String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println("Test Case 1: " + q5.checkIfPangram(sentence1)); // Expected output: true

        // Test Case 2: Not a pangram
        String sentence2 = "thequickbrownfoxjumpsoverthelazyg";
        System.out.println("Test Case 2: " + q5.checkIfPangram(sentence2)); // Expected output: false

        // Test Case 3: Empty string
        String sentence3 = "";
        System.out.println("Test Case 3: " + q5.checkIfPangram(sentence3)); // Expected output: false

        // Test Case 4: String with only one letter
        String sentence4 = "a1";
        System.out.println("Test Case 4: " + q5.checkIfPangram(sentence4)); // Expected output: false

        // Test Case 5: String with only one letter
        String sentence5 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("Test Case 5: " + q5.checkIfPangram(sentence5)); // Expected output: true

    }
}
