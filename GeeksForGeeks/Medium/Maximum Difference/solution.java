class Solution {
    public int findMaxDiff(int[] arr) {

        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();

        // Nearest Smaller Element on Left
        for (int i = 0; i < n; i++) {

            // Current element se bade ya equal elements hata do
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            // Agar stack empty hai to smaller element exist nahi karta
            left[i] = st.isEmpty() ? 0 : st.peek();

            // Current element stack me daal do
            st.push(arr[i]);
        }

        // Right side ke liye stack empty karo
        st.clear();

        // Nearest Smaller Element on Right
        for (int i = n - 1; i >= 0; i--) {

            // Current element se bade ya equal elements hata do
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            // Smaller element mile to store karo
            right[i] = st.isEmpty() ? 0 : st.peek();

            st.push(arr[i]);
        }

        int maxDiff = 0;

        // Maximum absolute difference find karo
        for (int i = 0; i < n; i++) {

            maxDiff = Math.max(
                maxDiff,
                Math.abs(left[i] - right[i])
            );
        }

        return maxDiff;
    }
}