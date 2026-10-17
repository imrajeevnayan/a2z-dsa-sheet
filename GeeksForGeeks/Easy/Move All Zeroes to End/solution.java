class Solution {
    void pushZerosToEnd(int[] arr) {
        int j = 0; // Pointer for next non-zero position

        // Step 1: Saare non-zero elements ko shuruwat mein lao
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }

        // Step 2: Baaki bacha hua part zeros se fill karo
        while (j < arr.length) {
            arr[j++] = 0;
        }
    }
}