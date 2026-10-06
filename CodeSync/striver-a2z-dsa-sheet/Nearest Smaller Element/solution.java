/*
 * Platform: InterviewBit
 * Problem: Nearest Smaller Element
 * URL: https://www.interviewbit.com/problems/nearest-smaller-element/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Stacks And Queues, Description, Discussion, Submissions, Hints, Hotel Service 51 Minutes Medium Asked in:, MAXSPPROD 88 Minutes Medium Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-06T18:15:53.030Z
 */

// tab tak usko hata do.
            // Kyunki wo future mein useful nahi hoga.
            while (!st.isEmpty() && st.peek() >= A[i]) {
                st.pop();
            }

            // Stack ka top hi nearest smaller element hai
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            // Current element ko stack mein daal do
            // taaki aage ke elements ke liye ye candidate ban sake.
            st.push(A[i]);
        }

            // Jab tak top current element se chhota nahi hai,
        for (int i = 0; i < n; i++) {

        java.util.Stack<Integer> st = new java.util.Stack<>();


        // Stack mein possible "smaller elements" rakhenge
        int[] ans = new int[n];
        int n = A.length;
