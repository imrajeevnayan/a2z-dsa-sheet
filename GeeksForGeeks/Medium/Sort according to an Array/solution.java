class Solution {
    static void relativeSort(int[] a1, int[] a2) {
        // Find maximum element in a1
        int max = 0;

        for (int x : a1) {
            max = Math.max(max, x);
        }

        // Frequency array
        int[] freq = new int[max + 1];

        // Count frequency of elements in a1
        for (int x : a1) {
            freq[x]++;
        }

        int index = 0;

        // First: arrange according to a2
        for (int x : a2) {

            // Important: x may be greater than max
            if (x <= max) {
                while (freq[x] > 0) {
                    a1[index++] = x;
                    freq[x]--;
                }
            }
        }

        // Second: remaining elements in ascending order
        for (int i = 0; i <= max; i++) {
            while (freq[i] > 0) {
                a1[index++] = i;
                freq[i]--;
            }
        }
    }
}
