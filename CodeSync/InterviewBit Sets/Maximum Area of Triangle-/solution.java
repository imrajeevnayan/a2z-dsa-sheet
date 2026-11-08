/*
 * Platform: InterviewBit
 * Problem: Maximum Area of Triangle!
 * URL: https://www.interviewbit.com/problems/maximum-area-of-triangle/
 * Language: Java
 * Difficulty: Medium
 * Topics: Programming, Arrays, Description, Discussion, Submissions, Hints, Even Product! 26 Minutes Very Easy Asked in:, Positive Negative 11 Minutes Very Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-08T03:54:48.479Z
 */

if (top[c1][j] == -1 || top[c2][j] == -1) {
                        continue;
                    }

                    int c3 = 3 - c1 - c2;

                    if (left[c3] == m) {
                        continue;
                    }

                    int base = Math.max(
                            Math.abs(bottom[c1][j] - top[c2][j]),
                            Math.abs(bottom[c2][j] - top[c1][j])
                    ) + 1;

                    int height = Math.max(
                            Math.abs(j - left[c3]),
                            Math.abs(j - right[c3])
                    ) + 1;

                    int area = (base * height + 1) / 2;

                    ans = Math.max(ans, area);
                }
            }
        }

        return ans;
    }

    private int getColor(char ch) {
        if (ch == 'r') return 0;
        if (ch == 'g') return 1;
        return 2;
    }
}
