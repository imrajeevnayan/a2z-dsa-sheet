/*
 * Platform: LeetCode
 * Problem: 26
 * URL: https://leetcode.com/problems/remove-outermost-parentheses/description/?envType=problem-list-v2&envId=stack
 * Language: Java
 * Difficulty: Easy
 * Topics: String, Stack, Bracket Sequences
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-08-19T13:51:35.728Z
 */

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count++ > 0) sb.append(c);
            } else {
                if (--count > 0) sb.append(c);
            }
        }
        return sb.toString();
    }
}
