/*
 * Platform: InterviewBit
 * Problem: Minimum Characters required to make a String Palindromic
 * URL: https://www.interviewbit.com/problems/minimum-characters-required-to-make-a-string-palindromic/
 * Language: Java
 * Difficulty: Medium
 * Topics: Programming, Strings, Description, Discussion, Submissions, Hints, Amazing Subarrays 26 Minutes Easy Asked in:, Convert to Palindrome 40 Minutes Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-12T16:48:25.411Z
 */

return A.length() - longestPalindromicSuffixLen;
    }
    
    private int[] computeLPS(String str) {
        int n = str.length();
        int[] lps = new int[n];
        int len = 0; // length of previous longest prefix suffix
        int i = 1;
        
        while (i < n) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
