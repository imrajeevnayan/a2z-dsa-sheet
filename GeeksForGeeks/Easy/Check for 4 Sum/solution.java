
class Solution {
    public boolean fourSum(int[] arr, int x) {
        Arrays.sort(arr); // Pehle sort karo taaki two pointers kaam kar sake
        int n = arr.length;

        // First number fix karo
        for (int i = 0; i < n - 3; i++) {
            // Duplicate skip karo (optional optimization)
            if (i > 0 && arr[i] == arr[i-1]) continue;

            // Second number fix karo
            for (int j = i + 1; j < n - 2; j++) {
                // Duplicate skip karo
                if (j > i + 1 && arr[j] == arr[j-1]) continue;

                // Ab left aur right pointers se remaining 2 numbers dhoondo
                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long)arr[i] + arr[j] + arr[left] + arr[right];

                    if (sum == x) return true;
                    else if (sum < x) left++;  // Sum badhana hai
                    else right--;              // Sum kam karna hai
                }
            }
        }

        return false;
    }
}