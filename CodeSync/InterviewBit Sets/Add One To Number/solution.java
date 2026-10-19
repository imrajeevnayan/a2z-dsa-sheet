/*
 * Platform: InterviewBit
 * Problem: Add One To Number
 * URL: https://www.interviewbit.com/problems/add-one-to-number/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Arrays, Description, Discussion, Submissions, Hints, Even Product! 26 Minutes Very Easy Asked in:, Maximum Sum Square SubMatrix Medium
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-19T15:53:16.187Z
 */

int start = 0;
        // Remove leading zeros

        }
            result = A;
        } else {
            }
                result[i + 1] = A[i];
            for (int i = 0; i < n; i++) {
            result[0] = carry;
            result = new int[n + 1];
        if (carry > 0) {
        // If carry remains (e.g. 999 -> 1000)

        int[] result;

                break;
        }

            if (carry == 0)
            carry = sum / 10;
            A[i] = sum % 10;
            int sum = A[i] + carry;
        for (int i = n - 1; i >= 0; i--) {

        int carry = 1;
        // Add 1 from the last digit

        int n = A.length;

    public int[] plusOne(int[] A) {
        while (start < result.length - 1 && result[start] == 0) {
