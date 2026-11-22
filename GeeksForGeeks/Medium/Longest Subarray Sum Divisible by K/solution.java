class Solution {
    public int longestSubarrayDivK(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        // remainder 0 at index -1
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            int rem = ((sum % k) + k) % k;

            if (map.containsKey(rem)) {
                maxLen = Math.max(maxLen, i - map.get(rem));
            } else {
                map.put(rem, i);
            }
        }

        return maxLen;
    }
}