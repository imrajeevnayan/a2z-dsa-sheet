class Solution {
    public int dominantPairs(int[] arr) {
        int n = arr.length;
        int half = n / 2;

        // Extract halves
        int[] firstHalf = Arrays.copyOfRange(arr, 0, half);
        int[] secondHalf = Arrays.copyOfRange(arr, half, n);

        // Sort both in descending order
        Arrays.sort(firstHalf);
        reverse(firstHalf);

        Arrays.sort(secondHalf);
        reverse(secondHalf);

        int count = 0;
        int i = 0; // Pointer for first half
        int j = 0; // Pointer for second half

        while (i < half && j < half) {
            if (firstHalf[i] >= 5L * secondHalf[j]) {
                // If firstHalf[i] is >= 5 * secondHalf[j], 
                // it will also be >= 5 * secondHalf[k] for all k > j (since sorted desc)
                count += (half - j);
                i++;
            } else {
                // Current secondHalf[j] is too large, move to smaller element
                j++;
            }
        }

        return count;
    }

    private void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}