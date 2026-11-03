/*
 * Platform: InterviewBit
 * Problem: Triplets with Sum between given range
 * URL: https://www.interviewbit.com/problems/triplets-with-sum-between-given-range/
 * Language: C
 * Difficulty: Medium
 * Topics: Programming, Arrays, Description, Discussion, Submissions, Hints, Even Product! 26 Minutes Very Easy Asked in:, Positive Negative 11 Minutes Very Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-03T14:26:10.840Z
 */

public int solve(String[] A) {

        double a = Double.parseDouble(A[0]);
        double b = Double.parseDouble(A[1]);
        double c = Double.parseDouble(A[2]);

        for (int i = 3; i < A.length; i++) {

            double sum = a + b + c;

            if (sum > 1.0 && sum < 2.0) {
                return 1;
            }

            double x = Double.parseDouble(A[i]);

            if (sum >= 2.0) {
                // replace the largest
                if (a >= b && a >= c)
                    a = x;
                else if (b >= a && b >= c)
                    b = x;
                else
                    c = x;
            } else { // sum <= 1
                // replace the smallest
                if (a <= b && a <= c)
                    a = x;
                else if (b <= a && b <= c)
                    b = x;
                else
                    c = x;
            }
        }

        double sum = a + b + c;
        return (sum > 1.0 && sum < 2.0) ? 1 : 0;
    }
}
