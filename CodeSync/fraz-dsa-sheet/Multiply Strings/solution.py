# Platform: InterviewBit
# Problem: Multiply Strings
# URL: https://www.interviewbit.com/problems/multiply-strings/
# Language: Python
# Difficulty: Medium
# Topics: Programming, Strings, Description, Discussion, Submissions, Hints, Amazing Subarrays 26 Minutes Easy Asked in:, Salutes 24 Minutes Medium Asked in:
# Runtime: N/A
# Memory: N/A
# Synced: 2026-10-24T08:37:54.309Z

result[p2] = sum % 10;
                result[p1] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < result.length && result[i] == 0) {
            i++;
        }

        while (i < result.length) {
            sb.append(result[i]);
            i++;
        }

        return sb.toString();
    }
}


                int sum = mul + result[p2];
