/*
 * Platform: LeetCode
 * Problem: 151. Reverse Words in a String
 * URL: https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=problem-list-v2&envId=da2mv5gs
 * Language: Java
 * Difficulty: Medium
 * Topics: Two Pointers, String
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-24T16:23:33.864Z
 */

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);
            if (i != 0) res.append(" ");
        }
        return res.toString();
    }
}
