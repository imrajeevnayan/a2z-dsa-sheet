/*
 * Platform: InterviewBit
 * Problem: Large Factorial
 * URL: https://www.interviewbit.com/problems/large-factorial/
 * Language: Java
 * Difficulty: Medium
 * Topics: Programming, Arrays, Description, Discussion, Submissions, Hints, Even Product! 26 Minutes Very Easy Asked in:, Positive Negative 11 Minutes Very Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-02T18:00:50.964Z
 */

public String solve(int A) {

        StringBuilder res = new StringBuilder("1");

        for (int num = 2; num <= A; num++) {

            int carry = 0;

            for (int i = res.length() - 1; i >= 0; i--) {

                int digit = res.charAt(i) - '0';

                int prod = digit * num + carry;

                res.setCharAt(i, (char) ('0' + (prod % 10)));

                carry = prod / 10;
            }

            while (carry > 0) {
                res.insert(0, carry % 10);
                carry /= 10;
            }
        }

        return res.toString();
    }
}
