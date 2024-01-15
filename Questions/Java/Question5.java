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

        // Test Case 1
        String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println("Test Case 1: " + q5.checkIfPangram(sentence1));

        // Test Case 2
        String sentence2 = "thequickbrownfoxjumpsoverthelazyg";
        System.out.println("Test Case 2: " + q5.checkIfPangram(sentence2));

        // Test Case 3
        String sentence3 = "";
        System.out.println("Test Case 3: " + q5.checkIfPangram(sentence3));

        // Test Case 4
        String sentence4 = "a1";
        System.out.println("Test Case 4: " + q5.checkIfPangram(sentence4));

        // Test Case 5
        String sentence5 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("Test Case 5: " + q5.checkIfPangram(sentence5));

    }
}
