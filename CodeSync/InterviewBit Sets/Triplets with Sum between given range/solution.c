/*
 * Platform: InterviewBit
 * Problem: Triplets with Sum between given range
 * URL: https://www.interviewbit.com/problems/374/
 * Language: C
 * Difficulty: Medium
 * Topics: Programming, Arrays, Description, Discussion, Submissions, Hints, Even Product! 26 Minutes Very Easy Asked in:, Positive Negative 11 Minutes Very Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-24T15:24:19.073Z
 */

double a = Double.parseDouble(A.get(0));
        double b = Double.parseDouble(A.get(1));
        double c = Double.parseDouble(A.get(2));

        for (int i = 3; i < A.size(); i++) {

            double sum = a + b + c;

            if (sum > 1.0 && sum < 2.0)
                return 1;

            double num = Double.parseDouble(A.get(i));

            if (sum >= 2.0) {

                if (a >= b && a >= c)
                    a = num;
                else if (b >= a && b >= c)
                    b = num;
                else
                    c = num;

            } else { // sum <= 1

                if (a <= b && a <= c)
                    a = num;
                else if (b <= a && b <= c)
                    b = num;
                else
                    c = num;
            }
        }

        double sum = a + b + c;

        return (sum > 1.0 && sum < 2.0) ? 1 : 0;
    }
}
