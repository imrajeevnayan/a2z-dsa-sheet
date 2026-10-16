class Solution {
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {

        Arrays.sort(b);

        ArrayList<Integer> ans = new ArrayList<>();

        for (int x : a) {
            ans.add(upperBound(b, x));
        }

        return ans;
    }

    // returns count of elements <= target
    private static int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}