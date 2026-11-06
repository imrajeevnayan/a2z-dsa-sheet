/*
 * Platform: InterviewBit
 * Problem: Simple Queries
 * URL: https://www.interviewbit.com/problems/simple-queries/
 * Language: Java
 * Difficulty: Medium
 * Topics: Programming, Binary Search, Description, Discussion, Submissions, Hints, First Index 20 Minutes Very Easy Asked in:, Request X Chocolates 38 Minutes Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-06T14:39:28.306Z
 */

factors.add(new int[] { p, cnt });
            divisors *= (cnt + 1);
        }

        long result = 1;

        for (int[] f : factors) {

            long prime = f[0];
            long exponent = (long) f[1] * divisors / 2;

            result = (result * modPow(prime, exponent)) % MOD;
        }

        return result;
    }

    private long modPow(long a, long b) {

        long res = 1;

        a %= MOD;

        while (b > 0) {

            if ((b & 1) == 1)
                res = (res * a) % MOD;

            a = (a * a) % MOD;

            b >>= 1;
        }

        return res;
    }
}
