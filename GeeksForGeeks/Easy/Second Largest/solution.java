class Solution {
    public int getSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE,second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second = max;
                max = arr[i];
            } 
            else if (arr[i] < max && arr[i] > second) second = arr[i];
        }
        if (second == Integer.MIN_VALUE) return -1;
        return second;
    }
}
