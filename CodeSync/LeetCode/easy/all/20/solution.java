/*
 * Platform: LeetCode
 * Problem: 20
 * URL: https://leetcode.com/problems/digit-frequency-score/description/?envType=problem-list-v2&envId=hash-table
 * Language: Java
 * Difficulty: Easy
 * Topics: Hash Table, Math
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-08-13T17:09:31.616Z
 */

class Solution {
    public int digitFrequencyScore(int n) {
     if (n == 0) return 0;
        int[] freq = new int[10];
        while (n > 0) {
            int d = n % 10;
            freq[d]++;
            n /= 10;
        }
        int score = 0;
        for (int d = 0; d < 10; d++) {
            if (freq[d] > 0) {
                score += d * freq[d];
            }
        }
        return score;
        
    }
}
