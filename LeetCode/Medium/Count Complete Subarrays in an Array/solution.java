class Solution {
    public int countCompleteSubarrays(int[] nums) {

        // distinct elements count karenge
        HashSet<Integer> distinct = new HashSet<>();

        for (int num : nums) {
            distinct.add(num);
        }

        int totalDistinct = distinct.size();
        int ans = 0;

        // Har index se subarray start karo
        for (int i = 0; i < nums.length; i++) {

            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < nums.length; j++) {

                // Current element add karo
                set.add(nums[j]);

                // Agar distinct count match ho gaya
                // to ye complete subarray hai
                if (set.size() == totalDistinct) {
                    ans++;
                }
            }
        }

        return ans;
    }
}