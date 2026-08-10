/*
 * Platform: LeetCode
 * Problem: 17
 * URL: https://leetcode.com/problems/lexicographically-smallest-palindrome/submissions/2101310080/?envType=problem-list-v2&envId=da2mv5gs
 * Language: Java
 * Difficulty: Easy
 * Topics: Uncategorized
 * Runtime: 6 ms
 * Memory: 47.02 MB
 * Synced: 2026-08-10T09:07:26.430Z
 */

class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] a = s.toCharArray();
        int l = 0,r = a.length - 1;
        while (l < r) {
            if (a[l] != a[r]) {
                if (a[l] < a[r])  a[r] = a[l];
                else  a[l] = a[r];
            }
            l++;
            r--;
        }
        return new String(a);
    }
}
