import java.util.*;

class Solution {
    public int firstElementKTime(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) == k) return num;
        }

        return -1;
    }
}