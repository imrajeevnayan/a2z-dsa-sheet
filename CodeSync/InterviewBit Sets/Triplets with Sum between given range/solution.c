/*
 * Platform: InterviewBit
 * Problem: Triplets with Sum between given range
 * URL: https://www.interviewbit.com/problems/374/
 * Language: C
 * Difficulty: Medium
 * Topics: Programming, Arrays, Description, Discussion, Submissions, Hints, Even Product! 26 Minutes Very Easy Asked in:, Positive Negative 11 Minutes Very Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-24T15:25:36.692Z
 */

public int solve(String[] A) {

        double x = Double.parseDouble(A[0]);
        double y = Double.parseDouble(A[1]);
        double z = Double.parseDouble(A[2]);

        for (int i = 3; i < A.length; i++) {

            double sum = x + y + z;

            if (sum > 1.0 && sum < 2.0)
                return 1;

            double num = Double.parseDouble(A[i]);

            if (sum >= 2.0) {

                if (x >= y && x >= z)
                    x = num;
                else if (y >= x && y >= z)
                    y = num;
                else
                    z = num;

            } else {

                if (x <= y && x <= z)
                    x = num;
                else if (y <= x && y <= z)
                    y = num;
                else
                    z = num;
            }
        }

        double sum = x + y + z;

        return (sum > 1.0 && sum < 2.0) ? 1 : 0;
    }
}
