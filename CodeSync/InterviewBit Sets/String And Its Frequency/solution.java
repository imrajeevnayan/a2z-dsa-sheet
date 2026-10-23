/*
 * Platform: InterviewBit
 * Problem: String And Its Frequency
 * URL: https://www.interviewbit.com/problems/string-and-its-frequency/
 * Language: Java
 * Difficulty: Medium
 * Topics: Programming, Strings, Description, Discussion, Submissions, Hints, Amazing Subarrays 26 Minutes Easy Asked in:, Salutes 24 Minutes Medium Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-23T16:06:18.483Z
 */

public String solve(String A) {
public class Solution {

import java.util.*;
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : A.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder ans = new StringBuilder();

        for(char ch : map.keySet()) {
            ans.append(ch);
            ans.append(map.get(ch));
        }

        return ans.toString();
    }
}
