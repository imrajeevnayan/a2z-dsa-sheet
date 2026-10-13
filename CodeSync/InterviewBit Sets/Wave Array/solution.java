/*
 * Platform: InterviewBit
 * Problem: Wave Array
 * URL: https://www.interviewbit.com/problems/wave-array/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Arrays, Upcoming Masterclass: Build a Career in DevOps, Cloud Computing & Cyber Security Register Now ->, Description, Discussion, Submissions, Hints
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-13T16:50:14.085Z
 */

import java.util.Arrays;

public class Solution {
    public int[] wave(int[] A) {
        // Step 1: Array ko sort karo
        Arrays.sort(A);
        
        // Step 2: Adjacent pairs ko swap karo (0 with 1, 2 with 3, etc.)
        for (int i = 0; i < A.length - 1; i += 2) {
            int temp = A[i];
            A[i] = A[i + 1];
            A[i + 1] = temp;
        }
        
        return A;
    }
}
