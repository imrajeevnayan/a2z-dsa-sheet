/*
 * Platform: InterviewBit
 * Problem: Palindrome String
 * URL: https://www.interviewbit.com/problems/palindrome-string/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Strings, Description, Discussion, Submissions, Hints, Amazing Subarrays 26 Minutes Easy Asked in:, Convert to Palindrome 40 Minutes Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-02T16:05:06.938Z
 */

public class Solution {
    public int isPalindrome(String A) {
       String s1=A.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       int left=0,right=s1.length()-1;
       while(left < right){
        if(s1.charAt(left) !=s1.charAt(right) ) return  0;
          left++;
          right--;
       }
       return 1; 
    }
}
