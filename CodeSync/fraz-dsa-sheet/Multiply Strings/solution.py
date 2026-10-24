# Platform: InterviewBit
# Problem: Multiply Strings
# URL: https://www.interviewbit.com/problems/multiply-strings/
# Language: Python
# Difficulty: Medium
# Topics: Programming, Strings, Description, Discussion, Submissions, Hints, Amazing Subarrays 26 Minutes Easy Asked in:, Salutes 24 Minutes Medium Asked in:
# Runtime: N/A
# Memory: N/A
# Synced: 2026-10-24T08:36:07.483Z

for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                int mul = (A.charAt(i) - '0') * (B.charAt(j) - '0');

                int p1 = i + j;
                int p2 = i + j + 1;

                int sum = mul + result[p2];

                result[p2] = sum % 10;
                result[p1] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < result.length && result[i] == 0) {
        int[] result = new int[n + m];

        int n = A.length();
        int m = B.length();

        }
            return "0";
        if (A.equals("0") || B.equals("0")) {

    public String multiply(String A, String B) {
public class Solution {
