class Solution {
    public ArrayList<Integer> subArraySum(int[] arr, long k) {
        ArrayList<Integer> ans = new ArrayList<>();

        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, -1);

        long prefix = 0;

        int bestStart = Integer.MAX_VALUE;
        int bestEnd = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];

            if (map.containsKey(prefix - k)) {
                int start = map.get(prefix - k) + 1;

                if (start < bestStart ||
                   (start == bestStart && i < bestEnd)) {
                    bestStart = start;
                    bestEnd = i;
                }
            }

            // Store FIRST occurrence only
            map.putIfAbsent(prefix, i);
        }

        if (bestStart == Integer.MAX_VALUE) {
            ans.add(-1);
            ans.add(-1);
        } else {
            ans.add(bestStart);
            ans.add(bestEnd);
        }

        return ans;
    }
}