/*
 * Platform: InterviewBit
 * Problem: Largest Number
 * URL: https://www.interviewbit.com/problems/largest-number/
 * Language: Java
 * Difficulty: Medium
 * Topics: Programming, Arrays, Description, Discussion, Submissions, Hints, Even Product! 26 Minutes Very Easy Asked in:, Positive Negative 11 Minutes Very Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-30T16:49:50.913Z
 */

}
        });

        // Handle cases like [0, 0, 0]
        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }
}
