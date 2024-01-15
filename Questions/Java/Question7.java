// Question 8
// Find the Missing Number
// Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
// find the one that is missing from the array.

public class Question7 {

    public int findMissingNumber(int[] nums) {
        // write
        // your
        // code
        // here
    }

    public static void main(String[] args) {
        Question7 q7 = new Question7();

        // Test Case 1
        int[] nums1 = { 0, 1, 3 };
        System.out.println("Test Case 1: " + q7.findMissingNumber(nums1));

        // Test Case 2
        int[] nums2 = { 1, 2, 3 };
        System.out.println("Test Case 2: " + q7.findMissingNumber(nums2));

        // Test Case 3
        int[] nums3 = { 0, 1, 2 };
        System.out.println("Test Case 3: " + q7.findMissingNumber(nums3));

        // Test Case 4
        int[] nums4 = { 0, 1, 2, 3 };
        System.out.println("Test Case 4: " + q7.findMissingNumber(nums4));

        // Test Case 5
        int[] nums5 = { 1, 2, 3, 4 };
        System.out.println("Test Case 5: " + q7.findMissingNumber(nums5));
    }

}
