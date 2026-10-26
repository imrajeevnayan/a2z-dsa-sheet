class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) set1.add(num);
        
        for (int num : nums2) set2.add(num);
        

        int answer1 = 0;
        int answer2 = 0;

        for (int num : nums1) {
            if (set2.contains(num)) {
                answer1++;
            }
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                answer2++;
            }
        }

        return new int[]{answer1, answer2};
    }
}
