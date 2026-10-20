class Solution {
    public static int pairsum(int[] arr) {

        int max1 = Math.max(arr[0], arr[1]);
        int max2 = Math.min(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {

            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } 
            else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }

        return max1 + max2;
    }
}