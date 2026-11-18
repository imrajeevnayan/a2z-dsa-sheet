/*
 * Platform: InterviewBit
 * Problem: Triplets with Sum between given range
 * URL: https://www.interviewbit.com/problems/374/
 * Language: C
 * Difficulty: Medium
 * Topics: Programming, Arrays, Description, Discussion, Submissions, Hints, Even Product! 26 Minutes Very Easy Asked in:, Positive Negative 11 Minutes Very Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-18T11:18:08.880Z
 */

for (int i = 0; i < n - 2; i++) {
            double x = Double.parseDouble(A[i]);

            for (int j = i + 1; j < n - 1; j++) {
                double y = Double.parseDouble(A[j]);

                for (int k = j + 1; k < n; k++) {
                    double z = Double.parseDouble(A[k]);

                    double sum = x + y + z;

                    if (sum > 1.0 && sum < 2.0) {
                        return 1;
                    }
                }
            }
        }

        return 0;
    }
}
