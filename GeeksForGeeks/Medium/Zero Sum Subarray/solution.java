class Solution {
    public boolean subArrayExists(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        int currSum = 0;
        set.add(0);

        for (int num : arr) {
            currSum += num;

            if (set.contains(currSum)) return true;
            set.add(currSum);
        }

        return false;
    }
}