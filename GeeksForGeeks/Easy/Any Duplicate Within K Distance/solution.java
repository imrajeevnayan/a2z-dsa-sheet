class Solution {
    public boolean checkWithinK(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int prevIndex = map.get(arr[i]);

                if (i - prevIndex <= k) {
                    return true;
                }
            }

            map.put(arr[i], i);
        }

        return false;
    }
}