class Solution {
    public int longestSubarray(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            // arr[i] > k hai to +1
            if (arr[i] > k) {
                prefixSum++;
            }
            // arr[i] <= k hai to -1
            else {
                prefixSum--;
            }

            // Agar prefixSum > 0 hai,
            // to index 0 se i tak ka subarray valid hai
            if (prefixSum > 0) {
                maxLen = i + 1;
            }

            // Agar ye prefixSum pehli baar aa raha hai,
            // to iska index store karo
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }

            // Hume aisa previous prefix chahiye
            // jo current prefix se chhota ho.
            // PrefixSum - previousSum > 0 hona chahiye.
            if (map.containsKey(prefixSum - 1)) {

                int previousIndex = map.get(prefixSum - 1);

                maxLen = Math.max(
                    maxLen,
                    i - previousIndex
                );
            }
        }

        return maxLen;
    }
}
