class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();

        // 1. Find peak
        int l = 0, r = n - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        int peak = l;

        // 2. Search in ascending part
        int idx = binarySearch(mountainArr, target, 0, peak, true);
        if (idx != -1) return idx;

        // 3. Search in descending part
        return binarySearch(mountainArr, target, peak + 1, n - 1, false);
    }

    private int binarySearch(MountainArray arr,
                             int target,
                             int left,
                             int right,
                             boolean ascending) {

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int val = arr.get(mid);

            if (val == target) {
                return mid;
            }

            if (ascending) {
                if (val < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (val < target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return -1;
    }
}