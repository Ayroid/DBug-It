// Question 8
// Find the Missing Number
// Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
// find the one that is missing from the array.

public class Solution7 {

    public int findMissingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return totalSum - actualSum;

    }

    public static void main(String[] args) {
        Solution7 q7 = new Solution7();

        // Test Case 1: Missing number is in the middle
        int[] nums1 = { 0, 1, 3 };
        System.out.println("Test Case 1: " + q7.findMissingNumber(nums1)); // Expected output: 2

        // Test Case 2: Missing number is at the beginning
        int[] nums2 = { 1, 2, 3 };
        System.out.println("Test Case 2: " + q7.findMissingNumber(nums2)); // Expected output: 0

        // Test Case 3: Missing number is at the end
        int[] nums3 = { 0, 1, 2 };
        System.out.println("Test Case 3: " + q7.findMissingNumber(nums3)); // Expected output: 3

        // Test Case 4: Missing number is the last number
        int[] nums4 = { 0, 1, 2, 3 };
        System.out.println("Test Case 4: " + q7.findMissingNumber(nums4)); // Expected output: 4

        // Test Case 5: Missing number is the first number
        int[] nums5 = { 1, 2, 3, 4 };
        System.out.println("Test Case 5: " + q7.findMissingNumber(nums5)); // Expected output: 0
    }

}
