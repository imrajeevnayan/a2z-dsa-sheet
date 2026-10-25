class Solution {

    public void rotateArr(int[] arr, int d) {

        int n = arr.length;

        // Agar d array size se bada ho
        // to unnecessary rotations avoid karne ke liye
        d = d % n;

        // Step-1:
        // Pehle d elements reverse karo
        reverse(arr, 0, d - 1);

        // Step-2:
        // Remaining elements reverse karo
        reverse(arr, d, n - 1);

        // Step-3:
        // Poora array reverse karo
        reverse(arr, 0, n - 1);
    }

    // Array ka particular portion reverse karne wala helper method
    private void reverse(int[] arr, int left, int right) {

        // Jab tak pointers cross nahi karte
        while (left < right) {

            // Swap karo
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Pointers move karo
            left++;
            right--;
        }
    }
}