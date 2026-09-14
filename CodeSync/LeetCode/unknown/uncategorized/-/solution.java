/*
 * Platform: LeetCode
 * Problem: -
 * URL: https://leetcode.com/submissions/detail/2141038812/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: 3 ms
 * Memory: 44.52 MB
 * Synced: 2026-09-13T22:31:08.238Z
 */

1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length())return false;
4        int freq[]=new int[26];
5        for(char c:s.toCharArray())freq[c-'a']++;
6        for(char c:t.toCharArray())freq[c-'a']--;
7        for(int f:freq){
8            if(f!=0)return false;
9        }
10        return true;
11    }
12}
