/*
 * Platform: InterviewBit
 * Problem: Minimum Characters required to make a String Palindromic
 * URL: https://www.interviewbit.com/problems/minimum-characters-required-to-make-a-string-palindromic/
 * Language: Java
 * Difficulty: Medium
 * Topics: Programming, Strings, Description, Discussion, Submissions, Hints, Amazing Subarrays 26 Minutes Easy Asked in:, Convert to Palindrome 40 Minutes Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-12T16:48:57.927Z
 */

i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                lps[i] = len;
                len++;
        while (i < n) {
            if (str.charAt(i) == str.charAt(len)) {
        
        int i = 1;
        int len = 0; // length of previous longest prefix suffix
        int[] lps = new int[n];
        int n = str.length();
    private int[] computeLPS(String str) {
    
    }
        // Characters needed = Total length - Length of already palindromic suffix
        return A.length() - longestPalindromicSuffixLen;
        int longestPalindromicSuffixLen = lps[temp.length() - 1];
        
        // that is also a suffix. Since suffix comes from revA, this matches 
        // the longest palindromic suffix of A.
        // The last value of LPS tells us the length of the longest prefix of 'temp'
