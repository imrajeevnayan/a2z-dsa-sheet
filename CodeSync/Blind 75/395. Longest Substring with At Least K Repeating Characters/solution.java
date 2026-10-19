/*
 * Platform: LeetCode
 * Problem: 395. Longest Substring with At Least K Repeating Characters
 * URL: https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/description/?envType=problem-list-v2&envId=sliding-window
 * Language: Java
 * Difficulty: Medium
 * Topics: Hash Table, String, Divide and Conquer, Sliding Window
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-19T16:16:14.189Z
 */

class Solution {
    public int longestSubstring(String s, int k) {
        if (s.length() < k) return 0;
        
        // Step 1: Count frequencies of all characters
        HashMap<Character, Integer>map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // Step 2: Find a splitter character (freq < k)
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) < k) {
                // Split the string at this character
                // Left part: s[0...i-1]
                // Right part: s[i+1...end]
                int leftResult = longestSubstring(s.substring(0, i), k);
                int rightResult = longestSubstring(s.substring(i + 1), k);
                return Math.max(leftResult, rightResult);
            }
        }
        
        // Step 3: If no splitter found, entire string is valid
        return s.length();
